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
    private Texture     m_plane_img;
    private float       m_airportRadius;


    private LinkedList<Sprite> m_planes;
    private Sprite             m_background;

    private int start_position_x;
    private int start_position_y;
    private int end_position_x;
    private int end_position_y;

    private ShapeRenderer m_shapeRenderer;
    private Circle        m_arrival;

    @Override
    public void create() {
        super.create();

        m_camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        centerCamera();

        m_batch         = new SpriteBatch();
        m_shapeRenderer = new ShapeRenderer();

        m_earthTexture = new Texture("assets/earth/map.jpg");
        m_plane_img    = new Texture("assets/plane.png");

        m_airportRadius = 3f;

        m_background = new Sprite(m_earthTexture);
        m_background.setOrigin(0f, 0f);
        m_background.setPosition(0f, 0f);
        m_background.setSize(m_camera.viewportWidth, m_camera.viewportHeight);

        // Test for plane image
        m_planes = new LinkedList<>();

        m_arrival = new Circle();
        spawnPlane();
    }

    @Override
    public void resize(final int width, final int height) {
        super.resize(width, height);

        m_camera.viewportWidth  = width;
        m_camera.viewportHeight = height;
        m_background.setSize(m_camera.viewportWidth, m_camera.viewportHeight);

        centerCamera();
    }

    @Override
    public void render() {
        ScreenUtils.clear(Color.BLACK);
        super.render();

        m_camera.update();
        m_batch.setProjectionMatrix(m_camera.combined);

        m_batch.begin();
        m_background.draw(m_batch);
        // Speed of plane movement
        for (Iterator<Sprite> iter = m_planes.iterator(); iter.hasNext(); ) {
            Sprite plane = iter.next();
            if (Intersector.overlaps(m_arrival, plane.getBoundingRectangle())) {
                iter.remove();
            }

            if (Math.abs((end_position_x - start_position_x)) > Math.abs((end_position_y - start_position_y))) {
                plane.translate((float) Math.abs(100.0 / (end_position_x - start_position_x)) * (end_position_x - start_position_x) * Gdx.graphics.getDeltaTime(),
                                (float) Math.abs(100.0 / (end_position_x - start_position_x)) * (end_position_y - start_position_y) * Gdx.graphics.getDeltaTime());
            }
            else {
                plane.translate((float) Math.abs(100.0 / (end_position_y - start_position_y)) * (end_position_x - start_position_x) * Gdx.graphics.getDeltaTime(),
                                (float) Math.abs(100.0 / (end_position_y - start_position_y)) * (end_position_y - start_position_y) * Gdx.graphics.getDeltaTime());
            }
        }
        for (Sprite plane : m_planes) {
            plane.draw(m_batch);
        }
        m_batch.end();
        m_shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        m_shapeRenderer.circle(start_position_x, start_position_y, m_airportRadius);
        m_shapeRenderer.circle(end_position_x, end_position_y, m_airportRadius);

        m_shapeRenderer.end();
    }

    @Override
    public void dispose() {
        super.dispose();

        m_batch.dispose();
        m_earthTexture.dispose();
        m_plane_img.dispose();
        m_shapeRenderer.dispose();
    }

    private void centerCamera() {
        m_camera.position.x = m_camera.viewportWidth / 2f;
        m_camera.position.y = m_camera.viewportHeight / 2f;
    }

    private void spawnPlane() {
        start_position_x = 640 - 419;
        start_position_y = 360 + 132;
        end_position_x   = 640 - 259;
        end_position_y   = 180 + 360;

        m_arrival.x      = end_position_x;
        m_arrival.y      = end_position_y;
        m_arrival.radius = m_airportRadius;

        Sprite plane = new Sprite(m_plane_img);
        plane.setSize(32, 32);
        plane.setCenter((float) start_position_x, (float) start_position_y);
        plane.flip(end_position_x < start_position_x, false);
        m_planes.add(plane);
    }
}
