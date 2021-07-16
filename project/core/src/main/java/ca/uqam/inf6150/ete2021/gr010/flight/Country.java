package ca.uqam.inf6150.ete2021.gr010.flight;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "COUNTRY")
public class Country
        implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "COUNTRYNO")
    private int id;
    
    @Column(name = "NAME")
    private String name;

    public Country() {
    }

    public Country(final String p_name) {
        name = p_name;
    }


    public int getId() {
        return id;
    }

    public void setId(final int p_id) {
        id = p_id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String p_name) {
        name = p_name;
    }
}
