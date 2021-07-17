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

    @ManyToOne
    @JoinColumn(name = "AIRPORTDEPARTURENO")
    private Airport m_beginAirport;

    @ManyToOne
    @JoinColumn(name = "AIRPORTARRIVALNO")
    private Airport m_endAirport;

    @ManyToOne
    @JoinColumn(name = "AIRCRAFTNO")
    private Aircraft m_aircraft;

    @ManyToOne
    @JoinColumn(name = "AIRLINENO")
    private Aircraft m_airline;

    @NonNull
    @Column(name = "DEPARTURETIME")
    private String m_departureTime;

    @NonNull
    @Column(name = "ARRIVALTIME")
    private String m_arrivalTime;

    @NonNull
    @Column(name = "DEPARTUREDATE")
    private java.sql.Date m_departureDate;

    @NonNull
    @Column(name = "ARRIVALDATE")
    private java.sql.Date m_arrivalDate;
}
