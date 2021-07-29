package ca.uqam.inf6150.ete2021.gr010.flight.gui.math;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Vector2;

public interface LibGDXMathUtils {

    static Vector2 getCirclePosition(final Circle p_circle) {
        return new Vector2(p_circle.x, p_circle.y);
    }
}
