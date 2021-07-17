package ca.uqam.inf6150.ete2021.gr010.flight;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "AIRPORT")
public class Airport
        implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "AIRPORTNO")
    private long m_id;

    @ManyToOne
    @JoinColumn(name = "CITYNO")
    private long m_city;

    @Column(name = "IATACODE")
    private String m_IATA;

    @Column(name = "NAME")
    private String m_name;
}
