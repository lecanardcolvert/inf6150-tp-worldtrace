package ca.uqam.inf6150.ete2021.gr010.flight;

import jakarta.persistence.Entity;

@Entity
public class Aircraft {

    private final int    m_id;
    private Manufacturer manufacturer;
    private String model;

    public Manufacturer getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }
}
