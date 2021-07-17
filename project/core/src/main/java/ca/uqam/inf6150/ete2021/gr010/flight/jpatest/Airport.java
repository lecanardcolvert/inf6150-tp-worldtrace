package ca.uqam.inf6150.ete2021.gr010.flight.jpatest;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "AIRPORT")
public class Airport {
    @Id
    @Column(name = "AIRPORTNO")
    private long airportno;

    @ManyToOne
    @JoinColumn(name = "CITYNO")
    private long cityno;

    @Column(name = "IATACODE")
    private String iatacode;

    @Column(name = "NAME")
    private String name;

    public long getAirportno() {
        return this.airportno;
    }

    public void setAirportno(long airportno) {
        this.airportno = airportno;
    }

    public long getCityno() {
        return this.cityno;
    }

    public void setCityno(long cityno) {
        this.cityno = cityno;
    }

    public String getIatacode() {
        return this.iatacode;
    }

    public void setIatacode(String iatacode) {
        this.iatacode = iatacode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
