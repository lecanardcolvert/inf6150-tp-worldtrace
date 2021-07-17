package ca.uqam.inf6150.ete2021.gr010.flight;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

@Data
@AllArgsConstructor
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
    private Country m_country;

    @NonNull
    @Column(name = "NAME")
    private String m_name;

    @Column(name = "LATITUDE")
    private double m_latitude;

    @Column(name = "LONGITUDE")
    private double m_longitude;
}
