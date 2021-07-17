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
    private String departuretime;

    @Column(name = "ARRIVALTIME")
    private String arrivaltime;

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
    private java.sql.Date departuredate;

    @Column(name = "ARRIVALDATE")
    private java.sql.Date arrivaldate;

    public long getId() {
        return this.m_id;
    }

    public void setId(long flightno) {
        this.m_id = flightno;
    }

    public String getDeparturetime() {
        return this.departuretime;
    }

    public void setDeparturetime(String departuretime) {
        this.departuretime = departuretime;
    }

    public String getArrivaltime() {
        return this.arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public long getBeginAirport() {
        return this.m_beginAirport;
    }

    public void setBeginAirport(long airportdepartureno) {
        this.m_beginAirport = airportdepartureno;
    }

    public long getEndAirport() {
        return this.m_endAirport;
    }

    public void setEndAirport(long airportarrivalno) {
        this.m_endAirport = airportarrivalno;
    }

    public long getAircraft() {
        return this.m_aircraft;
    }

    public void setAircraft(long aircraftno) {
        this.m_aircraft = aircraftno;
    }

    public long getAirline() {
        return this.m_airline;
    }

    public void setAirline(long airlineno) {
        this.m_airline = airlineno;
    }

    public java.sql.Date getDeparturedate() {
        return this.departuredate;
    }

    public void setDeparturedate(java.sql.Date departuredate) {
        this.departuredate = departuredate;
    }

    public java.sql.Date getArrivaldate() {
        return this.arrivaldate;
    }

    public void setArrivaldate(java.sql.Date arrivaldate) {
        this.arrivaldate = arrivaldate;
    }
}
