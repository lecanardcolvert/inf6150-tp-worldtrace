package ca.uqam.inf6150.ete2021.gr010.flight;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "COUNTRY")
public class Country
        implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "COUNTRYNO")
    private long m_id;

    @Column(name = "NAME")
    private String m_name;
}
