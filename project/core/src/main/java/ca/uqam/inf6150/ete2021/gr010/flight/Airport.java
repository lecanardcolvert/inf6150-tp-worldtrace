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
    private String iatacode;

    @Column(name = "NAME")
    private String name;

    public long getId() {
        return this.m_id;
    }

    public void setId(long airportno) {
        this.m_id = airportno;
    }

    public long getCity() {
        return this.m_city;
    }

    public void setCity(long cityno) {
        this.m_city = cityno;
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
