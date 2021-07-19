package ca.uqam.inf6150.ete2021.gr010.flight.repository;

import ca.uqam.inf6150.ete2021.gr010.flight.model.Flight;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepo
        extends CrudRepository<Flight, Long> {

    Flight findById(long p_id);
}
