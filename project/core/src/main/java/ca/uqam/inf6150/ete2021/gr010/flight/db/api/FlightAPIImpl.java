package ca.uqam.inf6150.ete2021.gr010.flight.db.api;

import lombok.NoArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.XSlf4j;
import org.slf4j.ext.XLogger;

@XSlf4j
@Value
@NoArgsConstructor
public class FlightAPIImpl
        implements FlightAPI {

    public static XLogger getLogger() {
        return log;
    }
}
