package ca.uqam.inf6150.ete2021.gr010.flight.jpatest;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CITY")
public class City {
    @Id
    @Column(name = "CITYNO")
    private long cityno;

    @ManyToOne
    @JoinColumn(name = "COUNTRYNO")
    private long countryno;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LATITUDE")
    private long latitude;

    @Column(name = "LONGITUDE")
    private long longitude;

    public long getCityno() {
        return this.cityno;
    }

    public void setCityno(long cityno) {
        this.cityno = cityno;
    }

    public long getCountryno() {
        return this.countryno;
    }

    public void setCountryno(long countryno) {
        this.countryno = countryno;
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
