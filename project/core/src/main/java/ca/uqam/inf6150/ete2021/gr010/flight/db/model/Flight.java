package ca.uqam.inf6150.ete2021.gr010.flight.db.model;

import ca.uqam.inf6150.ete2021.gr010.flight.db.model.meta.FlightTable;
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
@DatabaseTable(tableName = FlightTable.TABLE_NAME)
public final class Flight
        implements Serializable {

    @DatabaseField(columnName = FlightTable.COL_NAME_ID, generatedId = true, canBeNull = false)
    private long      m_id;
    @DatabaseField(columnName = FlightTable.COL_NAME_BEGIN_AIRPORT, foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, maxForeignAutoRefreshLevel = 4,
                   canBeNull = false)
    private Airport   m_beginAirport;
    @DatabaseField(columnName = FlightTable.COL_NAME_END_AIRPORT, foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, maxForeignAutoRefreshLevel = 4,
                   canBeNull = false)
    private Airport   m_endAirport;
    @DatabaseField(columnName = FlightTable.COL_NAME_AIRCRAFT, foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, maxForeignAutoRefreshLevel = 4,
                   canBeNull = false)
    private Aircraft  m_aircraft;
    @DatabaseField(columnName = FlightTable.COL_NAME_AIRLINE, foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, maxForeignAutoRefreshLevel = 4,
                   canBeNull = false)
    private Airline   m_airline;
    @DatabaseField(columnName = FlightTable.COL_NAME_DEPARTURE, canBeNull = false)
    private Timestamp m_departure;
    @DatabaseField(columnName = FlightTable.COL_NAME_ARRIVAL, canBeNull = false)
    private Timestamp m_arrival;


}
