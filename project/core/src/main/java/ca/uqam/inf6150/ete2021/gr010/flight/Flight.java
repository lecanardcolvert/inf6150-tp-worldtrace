package ca.uqam.inf6150.ete2021.gr010.flight;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "FLIGHT")
public class Flight
        implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "FLIGHTNO")
    private long m_id;

    @Column(name = "DEPARTURETIME")
    private String m_departureTime;

    @Column(name = "ARRIVALTIME")
    private String m_arrivalTime;

    @ManyToOne
    @JoinColumn(name = "AIRPORTDEPARTURENO")
    private long m_beginAirport;

    @ManyToOne
    @JoinColumn(name = "AIRPORTARRIVALNO")
    private long m_endAirport;

    @ManyToOne
    @JoinColumn(name = "AIRCRAFTNO")
    private long m_aircraft;

    @ManyToOne
    @JoinColumn(name = "AIRLINENO")
    private long m_airline;

    @Column(name = "DEPARTUREDATE")
    private java.sql.Date m_departureDate;

    @Column(name = "ARRIVALDATE")
    private java.sql.Date m_arrivalDate;
}
