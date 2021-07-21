package ca.uqam.inf6150.ete2021.gr010.flight.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DatabaseTable(tableName = "AIRPORT")
public final class Airport
        implements Serializable {

    @DatabaseField(columnName = "AIRPORTNO", generatedId = true, canBeNull = false)
    private long m_id;

    @DatabaseField(columnName = "CITYNO", foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, maxForeignAutoRefreshLevel = 4, canBeNull = false)
    private City m_city;

    @DatabaseField(columnName = "IATACODE", canBeNull = false)
    private String m_IATA;

    @DatabaseField(columnName = "NAME", canBeNull = false)
    private String m_name;
}
