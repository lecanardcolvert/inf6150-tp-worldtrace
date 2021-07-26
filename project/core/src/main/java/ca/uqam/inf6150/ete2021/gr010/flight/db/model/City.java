package ca.uqam.inf6150.ete2021.gr010.flight.db.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DatabaseTable(tableName = "CITY")
public final class City
        implements Serializable {

    @DatabaseField(columnName = "CITYNO", generatedId = true, canBeNull = false)
    private long m_id;

    @DatabaseField(columnName = "COUNTRYNO", foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, maxForeignAutoRefreshLevel = 4, canBeNull = false)
    private Country m_country;

    @DatabaseField(columnName = "NAME", canBeNull = false)
    private String m_name;

    @DatabaseField(columnName = "LATITUDE", canBeNull = false)
    private double m_latitude;

    @DatabaseField(columnName = "LONGITUDE", canBeNull = false)
    private double m_longitude;
}
