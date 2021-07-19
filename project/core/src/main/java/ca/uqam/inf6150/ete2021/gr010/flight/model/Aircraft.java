package ca.uqam.inf6150.ete2021.gr010.flight.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AIRCRAFT")
public final class Aircraft
        implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "AIRCRAFTNO")
    private long m_id;

    @ManyToOne
    @JoinColumn(name = "MANUFACTURERNO")
    private Manufacturer m_manufacturer;

    @NonNull
    @Column(name = "MODEL")
    private String m_model;
}
