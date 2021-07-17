package ca.uqam.inf6150.ete2021.gr010.flight;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "CITY")
public class City
        implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "CITYNO")
    private long m_id;

    @ManyToOne
    @JoinColumn(name = "COUNTRYNO")
    private long m_country;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LATITUDE")
    private long latitude;

    @Column(name = "LONGITUDE")
    private long longitude;

    public long getId() {
        return this.m_id;
    }

    public void setId(long cityno) {
        this.m_id = cityno;
    }

    public long getCountry() {
        return this.m_country;
    }

    public void setCountry(long countryno) {
        this.m_country = countryno;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLatitude() {
        return this.latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return this.longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }
}
