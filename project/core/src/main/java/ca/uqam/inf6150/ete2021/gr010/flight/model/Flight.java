package ca.uqam.inf6150.ete2021.gr010.flight.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
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
    @Column(name = "DEPARTURE")
    private Timestamp m_departure;

    @NonNull
    @Column(name = "ARRIVAL")
    private Timestamp m_arrival;
}
