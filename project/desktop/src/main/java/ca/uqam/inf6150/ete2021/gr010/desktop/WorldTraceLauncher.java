package ca.uqam.inf6150.ete2021.gr010.desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import ca.uqam.inf6150.ete2021.gr010.WorldTrace;

/**
 * Test JavaDoc generation.
 * TODO : remove JavaDoc test.
 */
public class WorldTraceLauncher {

    public static void main(String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();

        config.setWindowedMode(1280, 720);
        config.useOpenGL3(true, 4, 2);
        config.useVsync(true);
        config.setIdleFPS(15);

        new Lwjgl3Application(new WorldTrace(), config);
    }
}
