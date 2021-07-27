package ca.uqam.inf6150.ete2021.gr010;

import ca.uqam.inf6150.ete2021.gr010.flight.db.api.FlightAPI;
import ca.uqam.inf6150.ete2021.gr010.flight.db.model.Flight;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

/**
 * Main WorldTrace application.
 *
 * <p>
 * Use infographics technologies to render onto the screen plane flights.
 * </p>
 */
public class WorldTrace
        extends ApplicationAdapter {

    private static final String EARTH_TEXTURE_PATH              = "assets/earth/map.jpg";
    private static final int    FLIGHT_SEQUENCE_FETCH_THRESHOLD = 3;

    private OrthographicCamera m_camera;

    private SpriteBatch   m_batch;
    private ShapeRenderer m_shapeRenderer;

    private Texture m_earthTexture;
    private Sprite  m_earthMap;

    private FlightBuilder      m_currentFlight;
    private LinkedList<Flight> m_flightList;

    @Override
    public void create() {
        super.create();

        m_camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        centerCamera();

        m_batch         = new SpriteBatch();
        m_shapeRenderer = new ShapeRenderer();

        m_earthTexture = new Texture(EARTH_TEXTURE_PATH);
        setupBackground();

        m_flightList = new LinkedList<>();
        fetchFlights();
        spawnFlight();
    }

    @Override
    public void resize(final int width, final int height) {
        super.resize(width, height);

        m_camera.viewportWidth  = width;
        m_camera.viewportHeight = height;
        m_earthMap.setSize(m_camera.viewportWidth, m_camera.viewportHeight);

        centerCamera();
    }

    @Override
    public void render() {
        if (m_flightList.size() == FLIGHT_SEQUENCE_FETCH_THRESHOLD) {
            fetchFlights();
        }

        update();
        draw();
    }

    @Override
    public void dispose() {
        super.dispose();

        m_batch.dispose();
        m_shapeRenderer.dispose();
        m_earthTexture.dispose();

        if (m_currentFlight != null) {
            m_currentFlight.dispose();
        }
    }

    private void update() {
        updateCamera();
        translatePlane();
    }

    private void draw() {
        prepareScreen();
        batchDrawSprites();
        batchDrawShapes();
    }

    private void updateCamera() {
        m_camera.update();
        m_batch.setProjectionMatrix(m_camera.combined);
        m_shapeRenderer.setProjectionMatrix(m_camera.combined);
    }

    private void translatePlane() {
        if (m_currentFlight.planeExist()) {
            if (m_currentFlight.planeOverlapsAirport()) {
                m_currentFlight.destroyFlight();

                if (!m_flightList.isEmpty()) {
                    spawnFlight();
                }
            }
            else {
                m_currentFlight.translatePlane();
            }
        }
    }

    private void prepareScreen() {
        ScreenUtils.clear(Color.BLACK);
        super.render();
    }

    private void batchDrawSprites() {
        m_batch.begin();

        drawEarthMap();
        drawPlane();

        m_batch.end();
    }

    private void batchDrawShapes() {
        m_shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        drawAirports();
        m_shapeRenderer.end();
    }

    private void drawEarthMap() {
        m_earthMap.draw(m_batch);
    }

    private void drawPlane() {
        m_currentFlight.drawPlane(m_batch);
    }

    private void drawAirports() {
        m_currentFlight.drawAirports(m_shapeRenderer);
    }

    private void centerCamera() {
        m_camera.position.x = m_camera.viewportWidth / 2f;
        m_camera.position.y = m_camera.viewportHeight / 2f;
    }

    private void setupBackground() {
        m_earthMap = new Sprite(m_earthTexture);
        m_earthMap.setOrigin(0f, 0f);
        m_earthMap.setPosition(0f, 0f);
        m_earthMap.setSize(m_camera.viewportWidth, m_camera.viewportHeight);
    }

    private void fetchFlights() {
        final int FLIGHT_SEQUENCE_FETCH_QUANTITY = 10;

        List<Flight> fetchedFlights = null;

        try {
            if (m_flightList.isEmpty()) {
                fetchedFlights = FlightAPI.fetchLatestSequence(FLIGHT_SEQUENCE_FETCH_QUANTITY);
            }
            else {
                Timestamp tsFlight = m_flightList.get(FLIGHT_SEQUENCE_FETCH_THRESHOLD - 1).getDeparture();
                tsFlight.setTime(tsFlight.getTime() + 1L);

                fetchedFlights = FlightAPI.fetchLatestSequence(tsFlight, FLIGHT_SEQUENCE_FETCH_QUANTITY);
            }
        }
        catch (SQLException e) {
            // 1 does not mean anything. Only exit anomalously.
            System.exit(1);
        }

        m_flightList.addAll(fetchedFlights);
    }

    private void spawnFlight() {
        m_currentFlight = new FlightBuilder();
        Flight flight = m_flightList.pop();

        Vector2 halfViewport = new Vector2(m_camera.viewportWidth, m_camera.viewportHeight).scl(0.5f);

        m_currentFlight.findAirportCoordinates(flight, halfViewport);
        m_currentFlight.setFlightOrientation();
    }
}