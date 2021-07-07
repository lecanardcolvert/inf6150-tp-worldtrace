package ca.uqam.inf6150.ete2021.gr010;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
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

    private OrthographicCamera m_camera;

    private SpriteBatch m_batch;
    private Texture     m_texture;
    private Sprite      m_sprite;

    @Override
    public void create() {
        super.create();

        m_camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        centerCamera();

        m_batch = new SpriteBatch();
        m_texture = new Texture("assets/earthmap4k.jpg");
        m_sprite = new Sprite(m_texture);
        m_sprite.setOrigin(0f, 0f);
        m_sprite.setPosition(0f, 0f);
        m_sprite.setSize(m_camera.viewportWidth, m_camera.viewportHeight);
    }

    @Override
    public void render() {

        ScreenUtils.clear(Color.BLACK);
        super.render();

        m_camera.update();
        m_batch.setProjectionMatrix(m_camera.combined);

        m_batch.begin();
        m_sprite.draw(m_batch);
        m_batch.end();
    }

    @Override
    public void dispose() {
        super.dispose();

        m_batch.dispose();
        m_texture.dispose();
    }

    @Override
    public void resize(final int width, final int height) {
        super.resize(width, height);

        m_camera.viewportWidth = width;
        m_camera.viewportHeight = height;
        centerCamera();
    }

    private void centerCamera() {
        m_camera.position.x = m_camera.viewportWidth / 2f;
        m_camera.position.y = m_camera.viewportHeight / 2f;
    }
}
