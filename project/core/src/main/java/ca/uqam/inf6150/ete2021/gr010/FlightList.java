package ca.uqam.inf6150.ete2021.gr010;

import ca.uqam.inf6150.ete2021.gr010.flight.db.api.FlightAPI;
import ca.uqam.inf6150.ete2021.gr010.flight.db.model.Flight;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

public class FlightList extends LinkedList<Flight> {

    static final int FLIGHT_SEQUENCE_FETCH_QUANTITY = 10;

    private static final int FLIGHT_SEQUENCE_FETCH_THRESHOLD = 3;

    public FlightList() {
        fetchFlights();
    }

    private void fetchFlights() {
        List<Flight> fetchedFlights = null;

        try {
            if (this.isEmpty()) {
                fetchedFlights = FlightAPI.fetchLatestSequence(FLIGHT_SEQUENCE_FETCH_QUANTITY);
            }
            else {
                Timestamp tsFlight = this.get(FLIGHT_SEQUENCE_FETCH_THRESHOLD - 1).getDeparture();
                this.removeLast();

                fetchedFlights = FlightAPI.fetchLatestSequence(tsFlight, FLIGHT_SEQUENCE_FETCH_QUANTITY);
            }
        }
        catch (SQLException e) {
            // 1 does not mean anything. Only exit anomalously.
            System.exit(1);
        }

        this.addAll(fetchedFlights);
    }

    @Override
    public Flight pop() {
        if (this.size() == FLIGHT_SEQUENCE_FETCH_THRESHOLD) {
            fetchFlights();
        }

        return super.pop();
    }

}
