package ca.uqam.inf6150.ete2021.gr010.flight.gui.math;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Degree {
    ZERO(0.0),
    QUARTER(90.0),
    HALF(180.0),
    THREE_QUARTERS(270.0),
    FULL(360.0);

    private final double m_degrees;

    public static boolean smallerThan(float angle, Degree degree) {
        return angle < degree.getDegrees();
    }

    public static float addAngle(float angle, Degree degree) {
        return  angle + (float) degree.getDegrees();
    }
}
