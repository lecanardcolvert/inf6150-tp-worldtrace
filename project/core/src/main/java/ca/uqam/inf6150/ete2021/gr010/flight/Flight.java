package ca.uqam.inf6150.ete2021.gr010.flight;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Entity
@Table(name = "FLIGHT")
public final class Flight
        implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "FLIGHTNO")
    private long m_id;

    @NonNull
    @Column(name = "DEPARTURETIME")
    private String m_departureTime;

    @NonNull
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

    @NonNull
    @Column(name = "DEPARTUREDATE")
    private java.sql.Date m_departureDate;

    @NonNull
    @Column(name = "ARRIVALDATE")
    private java.sql.Date m_arrivalDate;
}
