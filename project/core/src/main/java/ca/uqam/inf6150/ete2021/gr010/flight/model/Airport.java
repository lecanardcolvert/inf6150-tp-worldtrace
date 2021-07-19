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
@Table(name = "AIRPORT")
public final class Airport
        implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "AIRPORTNO")
    private long m_id;

    @ManyToOne
    @JoinColumn(name = "CITYNO")
    private City m_city;

    @NonNull
    @Column(name = "IATACODE")
    private String m_IATA;

    @NonNull
    @Column(name = "NAME")
    private String m_name;
}
