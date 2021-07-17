package ca.uqam.inf6150.ete2021.gr010.flight;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

@Data
@Entity
@Table(name = "CITY")
public final class City
        implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "CITYNO")
    private long m_id;

    @ManyToOne
    @JoinColumn(name = "COUNTRYNO")
    private long m_country;

    @NonNull
    @Column(name = "NAME")
    private String m_name;

    @Column(name = "LATITUDE")
    private long m_latitude;

    @Column(name = "LONGITUDE")
    private long m_longitude;
}
