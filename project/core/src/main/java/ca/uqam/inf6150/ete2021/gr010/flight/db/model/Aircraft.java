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
@DatabaseTable(tableName = "AIRCRAFT")
public final class Aircraft
        implements Serializable {

    @DatabaseField(columnName = "AIRCRAFTNO", generatedId = true, canBeNull = false)
    private long m_id;

    @DatabaseField(columnName = "MANUFACTURERNO", foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, maxForeignAutoRefreshLevel = 4, canBeNull = false)
    private Manufacturer m_manufacturer;

    @DatabaseField(columnName = "MODEL", canBeNull = false)
    private String m_model;
}
