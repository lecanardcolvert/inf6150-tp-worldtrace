package ca.uqam.inf6150.ete2021.gr010.flight.api;

import ca.uqam.inf6150.ete2021.gr010.flight.db.DBConnection;
import ca.uqam.inf6150.ete2021.gr010.flight.model.Flight;

import java.sql.SQLException;

public interface FlightAPI {

    private static Class<Flight> getEntityClass() {
        return Flight.class;
    }

    default Flight getLatest() throws SQLException {
        var dao = DBConnection.getOrCreate().getDao(getEntityClass());

        return dao.queryBuilder()
                  .orderByNullsLast("DEPARTURE", false)
                  .limit(1L)
                  .queryForFirst();
    }
}
