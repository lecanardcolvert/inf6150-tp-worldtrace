package ca.uqam.inf6150.ete2021.gr010;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.ScalingViewport;

import java.util.Iterator;

/**
 * Test JavaDoc generation.
 * TODO : remove JavaDoc test.
 */
public class WorldTrace
        extends ApplicationAdapter {

    private OrthographicCamera  m_camera;

    private SpriteBatch         m_batch;
    private Texture             m_texture;
    private Texture             m_plane_img;                                                                            // image of a plane
    private Array<Rectangle>    m_planes;
    private Sprite              m_sprite;

    @Override
    public void create() {
        super.create();

        m_camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        centerCamera();

        m_batch         = new SpriteBatch();
        m_texture       = new Texture("assets/earthmap4k.jpg");
        m_plane_img     = new Texture("assets/airplane.png");                                                 // image of a plane
        m_sprite        = new Sprite(m_texture);
        m_sprite.setOrigin(0f, 0f);
        m_sprite.setPosition(0f, 0f);
        m_sprite.setSize(m_camera.viewportWidth, m_camera.viewportHeight);

        // Test for plane image
        m_planes = new Array<Rectangle>();
        spawnPlane();
    }

    @Override
    public void render() {

        ScreenUtils.clear(Color.BLACK);
        super.render();

        m_camera.update();
        m_batch.setProjectionMatrix(m_camera.combined);

        m_batch.begin();
        // l'exemple utilise batch
        m_sprite.draw(m_batch);
        // Speed of plane movement
        for (Iterator<Rectangle> iter = m_planes.iterator(); iter.hasNext(); ) {
            Rectangle plane = iter.next();
            plane.x += 100 * Gdx.graphics.getDeltaTime();
            plane.y += 100 * Gdx.graphics.getDeltaTime();
            if (plane.x + 32 > 1280 || plane.y + 32 > 720) {
                iter.remove();
            }
        }
        // selon l'exemple
        for (Rectangle plane: m_planes){
            m_batch.draw(m_plane_img, plane.x, plane.y);
        }
        m_batch.end();
    }

    @Override
    public void dispose() {
        super.dispose();

        m_batch.dispose();
        m_texture.dispose();
        m_plane_img.dispose();
    }

    @Override
    public void resize(final int width, final int height) {
        super.resize(width, height);

        m_camera.viewportWidth  = width;
        m_camera.viewportHeight = height;
        m_sprite.setSize(m_camera.viewportWidth, m_camera.viewportHeight);

        centerCamera();
    }

    private void centerCamera() {
        m_camera.position.x = m_camera.viewportWidth / 2f;
        m_camera.position.y = m_camera.viewportHeight / 2f;
    }

    private void spawnPlane() {
        Rectangle plane = new Rectangle();
        plane.x = MathUtils.random(0, 1280 - 32);
        plane.y = MathUtils.random(0, 720 - 32);
        plane.width = 32;
        plane.height = 32;
        m_planes.add(plane);
    }
}
