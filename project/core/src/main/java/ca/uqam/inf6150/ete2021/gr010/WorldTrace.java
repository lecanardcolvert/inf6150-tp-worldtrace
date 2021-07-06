package ca.uqam.inf6150.ete2021.gr010;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.ScalingViewport;

/**
 * Test JavaDoc generation.
 * TODO : remove JavaDoc test.
 */
public class WorldTrace
        extends ApplicationAdapter {

    private final Vector2 m_aspectRatio = new Vector2(16f, 9f);

    private ScalingViewport    m_viewport;
    private OrthographicCamera m_camera;
    private boolean            m_isCameraDirty;

    private SpriteBatch m_batch;
    private Texture     m_texture;
    private Sprite      m_sprite;

    @Override
    public void create() {
        super.create();

        m_camera   = new OrthographicCamera();
        m_viewport = new FillViewport(1280, 720, m_camera);
        m_viewport.apply();
        m_isCameraDirty = true;

        m_batch   = new SpriteBatch();
        m_texture = new Texture("assets/badlogic.jpg");
        m_sprite  = new Sprite(m_texture);
    }

    @Override
    public void render() {
        ScreenUtils.clear(Color.BLACK);
        super.render();

        if (m_isCameraDirty) {
            m_camera.update();
            m_batch.setProjectionMatrix(m_camera.combined);
            m_isCameraDirty = false;
        }

        // TODO : Remove?
        m_camera.update();
        m_batch.setProjectionMatrix(m_camera.combined);

        m_batch.begin();

        m_sprite.draw(m_batch);

        m_sprite.setPosition(0, 0);
        m_sprite.draw(m_batch);

        m_sprite.setPosition(10, 10);
        m_sprite.draw(m_batch);

        m_sprite.setPosition(-10, -10);
        m_sprite.draw(m_batch);

        m_sprite.setPosition(100, 100);
        m_sprite.draw(m_batch);

        m_batch.end();
    }

    @Override
    public void dispose() {
        super.dispose();

        m_batch.dispose();
        m_texture.dispose();
    }
}
