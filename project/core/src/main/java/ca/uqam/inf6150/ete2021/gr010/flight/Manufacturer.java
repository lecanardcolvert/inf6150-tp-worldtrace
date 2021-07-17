package ca.uqam.inf6150.ete2021.gr010.flight;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

@Data
@Entity
@Table(name = "MANUFACTURER")
public final class Manufacturer
        implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "MANUFACTURERNO")
    private long m_id;

    @NonNull
    @Column(name = "NAME")
    private String m_name;
}
