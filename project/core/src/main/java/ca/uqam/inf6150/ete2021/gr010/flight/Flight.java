package ca.uqam.inf6150.ete2021.gr010.flight;

import java.time.LocalDate;

public class Flight {
    private final int    m_id;

    private String departureTime;
    private String arrivalTime;
    private Airport airportDeparture;
    private Airport airportArrival;
    private Aircraft aircraft;
    private Airline airline;
    private LocalDate departureDate;
    private LocalDate arrivalDate;


    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public Airport getAirportDeparture() {
        return airportDeparture;
    }

    public Airport getAirportArrival() {
        return airportArrival;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public Airline getAirline() {
        return airline;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }
}
