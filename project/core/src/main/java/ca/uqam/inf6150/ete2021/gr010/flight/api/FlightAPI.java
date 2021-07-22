package ca.uqam.inf6150.ete2021.gr010.flight.api;

import ca.uqam.inf6150.ete2021.gr010.flight.db.DBConnection;
import ca.uqam.inf6150.ete2021.gr010.flight.model.Flight;
import ca.uqam.inf6150.ete2021.gr010.flight.model.meta.FlightTable;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

public interface FlightAPI {

    static List<Flight> fetchAll() throws SQLException {
        try {
            return getDao().queryBuilder()
                           .orderByNullsLast(FlightTable.COL_NAME_DEPARTURE, false)
                           .query();
        }
        catch (SQLException p_thrown) {
            FlightAPIImpl.getLogger().error("Failed to get all flights from the DB", p_thrown);
            throw p_thrown;
        }
    }

    static Dao<Flight, Long> getDao() throws SQLException {
        try {
            return DBConnection.getOrCreate().getDao(getEntityClass());
        }
        catch (SQLException p_thrown) {
            FlightAPIImpl.getLogger().error("Failed to fetch or create the Flight's table Dao from the DB", p_thrown);
            throw p_thrown;
        }
    }

    private static Class<Flight> getEntityClass() {
        return Flight.class;
    }

    static Flight fetchForemostInTime() throws SQLException {
        try {
            return getDao().queryBuilder()
                           .orderByNullsLast(FlightTable.COL_NAME_DEPARTURE, false)
                           .limit(1L)
                           .queryForFirst();
        }
        catch (SQLException p_thrown) {
            FlightAPIImpl.getLogger().error("Failed to fetch the foremost in time flight from the DB", p_thrown);
            throw p_thrown;
        }
    }

    static Flight fetchLatest() throws SQLException {
        try {
            return getDao().queryBuilder()
                           .orderByNullsLast(FlightTable.COL_NAME_DEPARTURE, false)
                           .limit(1L)
                           .queryForFirst();
        }
        catch (SQLException p_thrown) {
            FlightAPIImpl.getLogger().error("Failed to fetch the latest flight from the DB", p_thrown);
            throw p_thrown;
        }
    }
}
