package ca.uqam.inf6150.ete2021.gr010.flight;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "AIRLINE")
public class Airline
        implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "AIRLINENO")
    private long m_id;

    @Column(name = "NAME")
    private String name;

    public long getId() {
        return this.m_id;
    }

    public void setId(long airlineno) {
        this.m_id = airlineno;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
