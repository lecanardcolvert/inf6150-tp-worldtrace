package ca.uqam.inf6150.ete2021.gr010.flight.manualtest;

import ca.uqam.inf6150.ete2021.gr010.flight.model.Flight;
import ca.uqam.inf6150.ete2021.gr010.flight.repository.FlightRepo;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Log
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner demo(FlightRepo p_repo) {
        return (args) -> {
            log.info("Flights found with findAll():");
            log.info("-------------------------------");

            log.info(p_repo.findById(1).toString());

            for (Flight flight : p_repo.findAll()) {
                log.info(flight.toString());
            }

            log.info("");
        };
    }
}