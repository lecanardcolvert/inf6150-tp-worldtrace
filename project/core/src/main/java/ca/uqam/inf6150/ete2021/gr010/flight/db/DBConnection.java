package ca.uqam.inf6150.ete2021.gr010.flight.db;

import ca.uqam.inf6150.ete2021.gr010.flight.model.Country;
import ca.uqam.inf6150.ete2021.gr010.flight.model.Flight;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcPooledConnectionSource;
import com.j256.ormlite.jdbc.db.OracleDatabaseType;

import java.io.IOException;
import java.sql.SQLException;

public final class DBConnection {

    private static final String URL      = "jdbc:oracle:thin:@zeta2.labunix.uqam.ca:1521:baclab";
    private static final String USERNAME = "bj991090";
    private static final String PASSWORD = "iTfunnzz";

    public static void main(String[] args) {
        try (var connectionSource = new JdbcPooledConnectionSource(
                URL,
                USERNAME,
                PASSWORD,
                new OracleDatabaseType())) {

            Dao<Country, Long> flightDao = DaoManager.<Country, Long>createDao(connectionSource, Flight.class);
        }
        catch (SQLException | IOException p_throwables) {
            p_throwables.printStackTrace();
        }
    }
}
