package ca.uqam.inf6150.ete2021.gr010;

import ca.uqam.inf6150.ete2021.gr010.flight.api.FlightAPI;
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
import com.badlogic.gdx.utils.ScreenUtils;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Test JavaDoc generation.
 * TODO : remove JavaDoc test.
 */
public class WorldTrace
        extends ApplicationAdapter {

    private OrthographicCamera m_camera;

    private SpriteBatch m_batch;
    private Texture     m_earthTexture;
    private Texture     m_planeTexture;
    private float       m_airportRadius;

    private Sprite             m_earthMap;
    private LinkedList<Sprite> m_planes;
    private float              m_planeSize;

    private ShapeRenderer m_shapeRenderer;
    private Circle        m_arrivalAirport;
    private Circle        m_departureAirport;

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

        m_planes    = new LinkedList<>();
        m_planeSize = 32f;

        m_airportRadius    = 3f;
        m_arrivalAirport   = new Circle();
        m_departureAirport = new Circle();

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
        translatePlanes();
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

    private void translatePlanes() {
        for (Iterator<Sprite> iter = m_planes.iterator(); iter.hasNext(); ) {
            Sprite plane = iter.next();

            if (Intersector.overlaps(m_arrivalAirport, plane.getBoundingRectangle())) {
                iter.remove();
            }

            if (Math.abs((m_arrivalAirport.x - m_departureAirport.x)) > Math.abs((m_arrivalAirport.y - m_departureAirport.y))) {
                plane.translate((float) Math.abs(100.0 / (m_arrivalAirport.x - m_departureAirport.x)) * (m_arrivalAirport.x - m_departureAirport.x) * Gdx.graphics.getDeltaTime(),
                                (float) Math.abs(100.0 / (m_arrivalAirport.x - m_departureAirport.x)) * (m_arrivalAirport.y - m_departureAirport.y) * Gdx.graphics.getDeltaTime());
            }
            else {
                plane.translate((float) Math.abs(100.0 / (m_arrivalAirport.y - m_departureAirport.y)) * (m_arrivalAirport.x - m_departureAirport.x) * Gdx.graphics.getDeltaTime(),
                                (float) Math.abs(100.0 / (m_arrivalAirport.y - m_departureAirport.y)) * (m_arrivalAirport.y - m_departureAirport.y) * Gdx.graphics.getDeltaTime());
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
        drawPlanes();

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

    private void drawPlanes() {
        for (Sprite plane : m_planes) {
            plane.draw(m_batch);
        }
    }

    private void drawAirports() {
        m_shapeRenderer.circle(m_departureAirport.x, m_departureAirport.y, m_airportRadius);
        m_shapeRenderer.circle(m_arrivalAirport.x, m_arrivalAirport.y, m_airportRadius);
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
        findCoordinates();

        Sprite plane = new Sprite(m_planeTexture);
        plane.setSize(m_planeSize, m_planeSize);
        plane.setCenter(m_departureAirport.x, m_departureAirport.y);
        plane.flip(m_arrivalAirport.x < m_departureAirport.x, false);
        m_planes.add(plane);
    }

    private void findCoordinates() throws SQLException {
        Flight flight = FlightAPI.getLatest();

        m_departureAirport.x = (float) ((flight.getBeginAirport().getCity().getLongitude() / 180 * (m_camera.viewportWidth / 2)) + (m_camera.viewportWidth / 2));
        m_departureAirport.y = (float) ((flight.getBeginAirport().getCity().getLatitude() / 90 * (m_camera.viewportHeight / 2)) + (m_camera.viewportHeight / 2));
        m_arrivalAirport.x   = (float) ((flight.getEndAirport().getCity().getLongitude() / 180 * (m_camera.viewportWidth / 2)) + (m_camera.viewportWidth / 2));
        m_arrivalAirport.y   = (float) ((flight.getEndAirport().getCity().getLatitude() / 90 * (m_camera.viewportHeight / 2)) + (m_camera.viewportHeight / 2));

        m_arrivalAirport.radius   = m_airportRadius;
        m_departureAirport.radius = m_airportRadius;
    }
}
