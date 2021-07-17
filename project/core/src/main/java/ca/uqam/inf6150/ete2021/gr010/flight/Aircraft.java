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
    private String m_model;
}
