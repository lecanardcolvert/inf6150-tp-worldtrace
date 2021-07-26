package ca.uqam.inf6150.ete2021.gr010.flight.db.api;

import ca.uqam.inf6150.ete2021.gr010.flight.db.connection.DBConnection;
import ca.uqam.inf6150.ete2021.gr010.flight.db.model.Flight;
import ca.uqam.inf6150.ete2021.gr010.flight.db.model.meta.FlightTable;
import com.j256.ormlite.dao.Dao;
import lombok.NonNull;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

public interface FlightAPI {

    @NonNull
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

    @NonNull
    static Dao<Flight, Long> getDao() throws SQLException {
        try {
            return DBConnection.getOrCreate().getDao(getEntityClass());
        }
        catch (SQLException p_thrown) {
            FlightAPIImpl.getLogger().error("Failed to fetch or create the Flight's table Dao from the DB", p_thrown);
            throw p_thrown;
        }
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
        Timestamp now = now();
        return fetchLatest(now);
    }

    static Flight fetchLatest(Timestamp p_timeLimit) throws SQLException {
        final int sequenceQuantity = 1;
        final int firstFlightIndex = 0;

        Flight       latestFlight   = null;
        List<Flight> latestSequence = fetchLatestSequence(p_timeLimit, sequenceQuantity);

        if (!latestSequence.isEmpty()) {
            latestFlight = latestSequence.get(firstFlightIndex);
        }

        return latestFlight;
    }

    @NonNull
    static List<Flight> fetchLatestSequence(int p_sequenceQuantity) throws SQLException {
        Timestamp now = now();
        return fetchLatestSequence(now, p_sequenceQuantity);
    }

    @NonNull
    static List<Flight> fetchLatestSequence(Timestamp p_timeLimit, int p_sequenceQuantity) throws SQLException {
        try {
            List<Flight> latestSequence = getDao().queryBuilder()
                                                  .orderByNullsLast(FlightTable.COL_NAME_DEPARTURE, false)
                                                  .limit((long) p_sequenceQuantity)
                                                  .where()
                                                  .le(FlightTable.COL_NAME_DEPARTURE, p_timeLimit)
                                                  .query();

            assert latestSequence != null;
            return latestSequence;
        }
        catch (SQLException p_thrown) {
            FlightAPIImpl.getLogger()
                         .error("Failed to fetch the latest flight sequence from the DB parameterized with p_timeLimit={} and p_sequenceQuantity={}",
                                p_timeLimit,
                                p_sequenceQuantity,
                                p_thrown);
            throw p_thrown;
        }
    }

    @NonNull
    private static Class<Flight> getEntityClass() {
        return Flight.class;
    }

    @NonNull
    private static Timestamp now() {
        return Timestamp.from(Instant.now());
    }
}
