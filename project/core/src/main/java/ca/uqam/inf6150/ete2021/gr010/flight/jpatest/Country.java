package ca.uqam.inf6150.ete2021.gr010.flight.jpatest;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "COUNTRY")
public class Country implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "COUNTRYNO")
    private long countryno;

    @Column(name = "NAME")
    private String name;

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
}
