package ca.uqam.inf6150.ete2021.gr010;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/**
 * Test JavaDoc generation.
 * TODO : remove JavaDoc test.
 */
public class WorldTrace
        extends Game {

    private SpriteBatch m_batch;
    private Texture     m_img;

    @Override
    public void create() {
        m_batch = new SpriteBatch();
        m_img   = new Texture("assets/badlogic.jpg");
    }

    @Override
    public void render() {
        super.render();

        ScreenUtils.clear(1, 0, 0, 1);

        m_batch.begin();
        m_batch.draw(m_img, 0, 0);
        m_batch.end();
    }

    @Override
    public void dispose() {
        super.dispose();

        m_batch.dispose();
        m_img.dispose();
    }
}
