package ca.uqam.inf6150.ete2021.gr010;

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

    private int start_position_x;
    private int start_position_y;

    private ShapeRenderer m_shapeRenderer;
    private Circle        m_arrivalAirport;

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

        m_airportRadius  = 3f;
        m_arrivalAirport = new Circle();

        m_planes = new LinkedList<>();

        spawnPlane();
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

            if (Math.abs((m_arrivalAirport.x - start_position_x)) > Math.abs((m_arrivalAirport.y - start_position_y))) {
                plane.translate((float) Math.abs(100.0 / (m_arrivalAirport.x - start_position_x)) * (m_arrivalAirport.x - start_position_x) * Gdx.graphics.getDeltaTime(),
                                (float) Math.abs(100.0 / (m_arrivalAirport.x - start_position_x)) * (m_arrivalAirport.y - start_position_y) * Gdx.graphics.getDeltaTime());
            }
            else {
                plane.translate((float) Math.abs(100.0 / (m_arrivalAirport.y - start_position_y)) * (m_arrivalAirport.x - start_position_x) * Gdx.graphics.getDeltaTime(),
                                (float) Math.abs(100.0 / (m_arrivalAirport.y - start_position_y)) * (m_arrivalAirport.y - start_position_y) * Gdx.graphics.getDeltaTime());
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
        m_shapeRenderer.circle(start_position_x, start_position_y, m_airportRadius);
        m_shapeRenderer.circle(m_arrivalAirport.x, m_arrivalAirport.y, m_airportRadius);
    }

    @Override
    public void dispose() {
        super.dispose();

        m_batch.dispose();
        m_earthTexture.dispose();
        m_planeTexture.dispose();
        m_shapeRenderer.dispose();
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

    private void spawnPlane() {
        start_position_x = 640 - 419;
        start_position_y = 360 + 132;
        int end_position_x = 640 - 259;
        int end_position_y = 180 + 360;

        m_arrivalAirport.x      = end_position_x;
        m_arrivalAirport.y      = end_position_y;
        m_arrivalAirport.radius = m_airportRadius;

        Sprite plane = new Sprite(m_planeTexture);
        plane.setSize(32, 32);
        plane.setCenter((float) start_position_x, (float) start_position_y);
        plane.flip(end_position_x < start_position_x, false);
        m_planes.add(plane);
    }
}
