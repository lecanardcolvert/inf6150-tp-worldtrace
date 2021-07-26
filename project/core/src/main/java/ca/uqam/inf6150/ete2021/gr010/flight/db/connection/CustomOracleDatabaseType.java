package ca.uqam.inf6150.ete2021.gr010.flight.db.connection;

import com.j256.ormlite.jdbc.db.OracleDatabaseType;

class CustomOracleDatabaseType
        extends OracleDatabaseType {

    @Override
    public boolean isLimitSqlSupported() {
        return false;
    }
}
