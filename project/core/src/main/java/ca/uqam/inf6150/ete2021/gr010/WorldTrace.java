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
    private Sprite      m_sprite;

    @Override
    public void create() {
        m_camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        m_batch = new SpriteBatch();
        Texture texture = new Texture("assets/badlogic.jpg");
        m_sprite = new Sprite(texture);
    }

    @Override
    public void render() {
        m_camera.zoom += Gdx.graphics.getDeltaTime() * 0.001f;

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
}
