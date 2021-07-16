package ca.uqam.inf6150.ete2021.gr010.flight.jpatest;

import javax.persistence.*;

@Entity
@Table(name = "FLIGHT")
public class Flight {
    @Id
    @Column(name = "FLIGHTNO")
    private long flightno;

    @Column(name = "DEPARTURETIME")
    private String departuretime;

    @Column(name = "ARRIVALTIME")
    private String arrivaltime;

    @ManyToOne
    @JoinColumn(name = "AIRPORTDEPARTURENO")
    private long airportdepartureno;

    @ManyToOne
    @JoinColumn(name = "AIRPORTARRIVALNO")
    private long airportarrivalno;

    @ManyToOne
    @JoinColumn(name = "AIRCRAFTNO")
    private long aircraftno;

    @ManyToOne
    @JoinColumn(name = "AIRLINENO")
    private long airlineno;

    @Column(name = "DEPARTUREDATE")
    private java.sql.Date departuredate;

    @Column(name = "ARRIVALDATE")
    private java.sql.Date arrivaldate;

    public long getFlightno() {
        return this.flightno;
    }

    public void setFlightno(long flightno) {
        this.flightno = flightno;
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

    public long getAirportdepartureno() {
        return this.airportdepartureno;
    }

    public void setAirportdepartureno(long airportdepartureno) {
        this.airportdepartureno = airportdepartureno;
    }

    public long getAirportarrivalno() {
        return this.airportarrivalno;
    }

    public void setAirportarrivalno(long airportarrivalno) {
        this.airportarrivalno = airportarrivalno;
    }

    public long getAircraftno() {
        return this.aircraftno;
    }

    public void setAircraftno(long aircraftno) {
        this.aircraftno = aircraftno;
    }

    public long getAirlineno() {
        return this.airlineno;
    }

    public void setAirlineno(long airlineno) {
        this.airlineno = airlineno;
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
