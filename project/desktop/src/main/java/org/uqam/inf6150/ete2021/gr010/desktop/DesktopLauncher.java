package org.uqam.inf6150.ete2021.gr010.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import org.uqam.inf6150.ete2021.gr010.WorldTrace;

/**
 * Test JavaDoc generation.
 * TODO : remove JavaDoc test.
 */
public class DesktopLauncher {

    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        new LwjglApplication(new WorldTrace(), config);
    }
}
