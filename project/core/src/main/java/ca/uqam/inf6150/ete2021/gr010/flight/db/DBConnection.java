package ca.uqam.inf6150.ete2021.gr010.flight.db;

import ca.uqam.inf6150.ete2021.gr010.flight.model.Country;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcPooledConnectionSource;
import com.j256.ormlite.jdbc.db.OracleDatabaseType;
import com.j256.ormlite.support.ConnectionSource;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;

import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;

@Log
@Getter()
@Setter(AccessLevel.PRIVATE)
public final class DBConnection
        implements Closeable {

    private static final String URL      = "jdbc:oracle:thin:@zeta2.labunix.uqam.ca:1521:baclab";
    private static final String USERNAME = "bj991090";
    private static final String PASSWORD = "iTfunnzz";

    private ConnectionSource m_connection;

    public DBConnection() {
        open();
    }

    public void open() {
        try {
            close();
        }
        catch (IOException p_thrown) {
            log.severe(p_thrown.getMessage());
            releaseConnectionHandle();
        }

        try {
            var connectionPlaceholder = new JdbcPooledConnectionSource(
                    URL,
                    USERNAME,
                    PASSWORD,
                    new OracleDatabaseType());

            setConnection(connectionPlaceholder);

            log.info("DB successfully connected.");
        }
        catch (SQLException p_thrown) {
            log.severe(p_thrown.getMessage());
            releaseConnectionHandle();
        }
    }

    @Override
    public void close() throws IOException {
        if (isOpen()) {
            getConnection().close();
            releaseConnectionHandle();
        }
    }

    public boolean isOpen() {
        return getConnection() != null;
    }

    private void releaseConnectionHandle() {
        setConnection(null);
    }

    public static void main(String[] args) {
        // TODO : Remove
        try (var connectionSource = new JdbcPooledConnectionSource(
                URL,
                USERNAME,
                PASSWORD,
                new OracleDatabaseType())) {

            Dao<Country, Long> countryDao = DaoManager.createDao(connectionSource, Country.class);

            Country fetchedCountry = countryDao.queryForId(1L);
            log.info(fetchedCountry.toString());
        }
        catch (SQLException | IOException p_throwables) {
            p_throwables.printStackTrace();
        }
    }
}
