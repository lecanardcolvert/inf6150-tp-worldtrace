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
@DatabaseTable(tableName = "MANUFACTURER")
public final class Manufacturer
        implements Serializable {

    @DatabaseField(columnName = "MANUFACTURERNO", generatedId = true, canBeNull = false)
    private long m_id;

    @DatabaseField(columnName = "NAME", canBeNull = false)
    private String m_name;
}
