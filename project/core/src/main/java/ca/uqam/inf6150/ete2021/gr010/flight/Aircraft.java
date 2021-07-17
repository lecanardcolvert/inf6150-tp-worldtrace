package ca.uqam.inf6150.ete2021.gr010.flight;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "AIRCRAFT")
public class Aircraft
        implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "AIRCRAFTNO")
    private long m_id;

    @ManyToOne
    @JoinColumn(name = "MANUFACTURERNO")
    private long m_manufacturer;

    @Column(name = "MODEL")
    private String model;

    public long getId() {
        return this.m_id;
    }

    public void setId(long aircraftno) {
        this.m_id = aircraftno;
    }

    public long getManufacturer() {
        return this.m_manufacturer;
    }

    public void setManufacturer(long manufacturerno) {
        this.m_manufacturer = manufacturerno;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
