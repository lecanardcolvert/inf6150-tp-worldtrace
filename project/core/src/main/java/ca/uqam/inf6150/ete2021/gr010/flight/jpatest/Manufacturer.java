package ca.uqam.inf6150.ete2021.gr010.flight.jpatest;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "MANUFACTURER")
public class Manufacturer implements Serializable {
    @Id
    @Column(name = "MANUFACTURERNO")
    private long manufacturerno;

    @Column(name = "NAME")
    private String name;

    public long getManufacturerno() {
        return this.manufacturerno;
    }

    public void setManufacturerno(long manufacturerno) {
        this.manufacturerno = manufacturerno;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
