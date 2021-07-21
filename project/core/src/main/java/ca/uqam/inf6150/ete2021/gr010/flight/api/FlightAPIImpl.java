package ca.uqam.inf6150.ete2021.gr010.flight.api;

import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@NoArgsConstructor
public class FlightAPIImpl
        implements FlightAPI {

    static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(FlightAPI.class.getName());
}
