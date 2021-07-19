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
@DatabaseTable(tableName = "COUNTRY")
public final class Country
        implements Serializable {

    @DatabaseField(columnName = "COUNTRYNO", generatedId = true, canBeNull = false)
    private long m_id;

    @DatabaseField(columnName = "NAME", canBeNull = false)
    private String m_name;
}
