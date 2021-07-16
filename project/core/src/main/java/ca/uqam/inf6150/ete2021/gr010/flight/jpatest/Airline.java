package ca.uqam.inf6150.ete2021.gr010.flight.jpatest;

import javax.persistence.*;

@Entity
@Table(name = "AIRLINE")
public class Airline {
    @Id
    @Column(name = "AIRLINENO")
    private long airlineno;

    @Column(name = "NAME")
    private String name;

    public long getAirlineno() {
        return this.airlineno;
    }

    public void setAirlineno(long airlineno) {
        this.airlineno = airlineno;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
