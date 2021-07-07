package ca.uqam.inf6150.ete2021.gr010.desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import ca.uqam.inf6150.ete2021.gr010.WorldTrace;

/**
 * Test JavaDoc generation.
 * TODO : remove JavaDoc test.
 */
public class DesktopLauncher {

    public static void main(String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        new Lwjgl3Application(new WorldTrace(), config);
    }
}
