package ca.uqam.inf6150.ete2021.gr010;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Degree {
    ZERO(0.0),
    QUARTER(90),
    HALF(180),
    THREE_QUARTERS(270),
    FULL(360);

    private final double m_degrees;
}
