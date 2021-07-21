package ca.uqam.inf6150.ete2021.gr010;

import ca.uqam.inf6150.ete2021.gr010.flight.api.FlightAPI;
import ca.uqam.inf6150.ete2021.gr010.flight.model.City;
import ca.uqam.inf6150.ete2021.gr010.flight.model.Flight;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;

import java.sql.SQLException;

/**
 * Test JavaDoc generation.
 * TODO : remove JavaDoc test.
 */
public class WorldTrace
        extends ApplicationAdapter {

    private OrthographicCamera m_camera;

    private SpriteBatch   m_batch;
    private ShapeRenderer m_shapeRenderer;

    private Texture m_earthTexture;
    private Texture m_planeTexture;

    private Sprite m_earthMap;

    private float m_planeSize;
    private float m_planeSpeed;
    private float m_airportRadius;

    private Sprite  m_plane;
    private Circle  m_arrivalAirport;
    private Circle  m_departureAirport;
    private Vector2 m_planeDir;

    @Override
    public void create() {
        super.create();

        m_camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        centerCamera();

        m_batch         = new SpriteBatch();
        m_shapeRenderer = new ShapeRenderer();

        m_earthTexture = new Texture("assets/earth/map.jpg");
        m_planeTexture = new Texture("assets/plane.png");

        setupBackground();

        m_planeSize     = 32f;
        m_planeSpeed    = 100f;
        m_airportRadius = 3f;

        try {
            spawnPlane();
        }
        catch (SQLException p_ignored) {
            // Ignore exceptions
        }
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
        update();
        draw();
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
        if (m_plane != null) {
            assert m_arrivalAirport != null;
            assert m_departureAirport != null;

            if (Intersector.overlaps(m_arrivalAirport, m_plane.getBoundingRectangle())) {
                destroyFlight();
            }
            else {
                Vector2 translation = new Vector2(m_planeDir).scl(m_planeSpeed).scl(Gdx.graphics.getDeltaTime());
                m_plane.translate(translation.x, translation.y);
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

    private void destroyFlight() {
        m_plane            = null;
        m_arrivalAirport   = null;
        m_departureAirport = null;
        m_planeDir.setZero();
    }

    private void drawEarthMap() {
        m_earthMap.draw(m_batch);
    }

    private void drawPlane() {
        if (m_plane != null) {
            m_plane.draw(m_batch);
        }
    }

    private void drawAirports() {
        if (m_departureAirport != null && m_arrivalAirport != null) {
            m_shapeRenderer.circle(m_departureAirport.x, m_departureAirport.y, m_airportRadius);
            m_shapeRenderer.circle(m_arrivalAirport.x, m_arrivalAirport.y, m_airportRadius);
        }
    }

    @Override
    public void dispose() {
        super.dispose();

        m_batch.dispose();
        m_shapeRenderer.dispose();
        m_earthTexture.dispose();
        m_planeTexture.dispose();
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

    private void spawnPlane() throws SQLException {
        assert m_arrivalAirport != null;
        assert m_departureAirport != null;

        findCoordinates();

        m_plane = new Sprite(m_planeTexture);
        m_plane.setSize(m_planeSize, m_planeSize);
        m_plane.setCenter(m_departureAirport.x, m_departureAirport.y);
        m_plane.flip(m_arrivalAirport.x < m_departureAirport.x, false);
    }

    private void findCoordinates() throws SQLException {
        assert m_arrivalAirport != null;
        assert m_departureAirport != null;

        Flight flight = FlightAPI.getLatest();

        Vector2 halfViewport = new Vector2(m_camera.viewportWidth, m_camera.viewportHeight).scl(0.5f);
        City    beginAirport = flight.getBeginAirport().getCity();
        City    endAirport   = flight.getEndAirport().getCity();

        spawnAirports(halfViewport, beginAirport, endAirport);
    }

    private void spawnAirports(final Vector2 halfViewport, final City beginAirport, final City endAirport) {
        m_arrivalAirport   = new Circle();
        m_departureAirport = new Circle();

        m_departureAirport.x = halfViewport.x + (float) ((beginAirport.getLongitude() / Degree.HALF.getDegrees() * halfViewport.x));
        m_departureAirport.y = halfViewport.y + (float) ((beginAirport.getLatitude() / Degree.QUARTER.getDegrees() * halfViewport.y));
        m_arrivalAirport.x   = halfViewport.x + (float) ((endAirport.getLongitude() / Degree.HALF.getDegrees() * halfViewport.x));
        m_arrivalAirport.y   = halfViewport.y + (float) ((endAirport.getLatitude() / Degree.QUARTER.getDegrees() * halfViewport.y));

        m_arrivalAirport.radius   = m_airportRadius;
        m_departureAirport.radius = m_airportRadius;

        Vector2 start = new Vector2(m_departureAirport.x, m_departureAirport.y);
        Vector2 end   = new Vector2(m_arrivalAirport.x, m_arrivalAirport.y);

        m_planeDir = end.sub(start).nor();
    }
}
