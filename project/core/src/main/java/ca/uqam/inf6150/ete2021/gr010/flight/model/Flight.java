package ca.uqam.inf6150.ete2021.gr010.flight.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DatabaseTable(tableName = "FLIGHT")
public final class Flight
        implements Serializable {

    @DatabaseField(columnName = "AIRLINENO", generatedId = true, canBeNull = false)
    private long m_id;

    @DatabaseField(columnName = "AIRPORTDEPARTURENO", foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, maxForeignAutoRefreshLevel = 4, canBeNull = false)
    private Airport m_beginAirport;

    @DatabaseField(columnName = "AIRPORTARRIVALNO", foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, maxForeignAutoRefreshLevel = 4, canBeNull = false)
    private Airport m_endAirport;

    @DatabaseField(columnName = "AIRCRAFTNO", foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, maxForeignAutoRefreshLevel = 4, canBeNull = false)
    private Aircraft m_aircraft;

    @DatabaseField(columnName = "AIRLINENO", foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, maxForeignAutoRefreshLevel = 4, canBeNull = false)
    private Airline m_airline;

    @DatabaseField(columnName = "DEPARTURE", canBeNull = false)
    private Timestamp m_departure;

    @DatabaseField(columnName = "ARRIVAL", canBeNull = false)
    private Timestamp m_arrival;
}
