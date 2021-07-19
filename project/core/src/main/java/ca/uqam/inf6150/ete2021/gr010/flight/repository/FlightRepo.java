package ca.uqam.inf6150.ete2021.gr010.flight.repository;

import ca.uqam.inf6150.ete2021.gr010.flight.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepo
        extends JpaRepository<Flight, Long> {

    Flight findById(long p_id);
}
