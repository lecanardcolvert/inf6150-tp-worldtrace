package ca.uqam.inf6150.ete2021.gr010.flight;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "MANUFACTURER")
public class Manufacturer
        implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "MANUFACTURERNO")
    private long m_id;

    @Column(name = "NAME")
    private String name;

    public long getId() {
        return this.m_id;
    }

    public void setId(long manufacturerno) {
        this.m_id = manufacturerno;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
