package ca.uqam.inf6150.ete2021.gr010.flight;

import java.time.LocalDate;

public class Flight {
    private final String departureTime;
    private final String arrivalTime;
    private final Airport airportDeparture;
    private final Airport airportArrival;
    private final Aircraft aircraft;
    private final Airline airline;
    private final LocalDate departureDate;
    private final LocalDate arrivalDate;

    /**
     * Flight constructor.
     * @param departureTime     The departure time of the flight.
     * @param arrivalTime       The arrival time of the flight.
     * @param airportDeparture  The departure airport of the flight.
     * @param airportArrival    The arrival airport of the flight.
     * @param aircraft          The aircraft of the flight.
     * @param airline           The airline of the flight.
     * @param departureDate     The departure time of the flight.
     * @param arrivalDate       The arrival time of the flight.
     */
    Flight(String departureTime, String arrivalTime, Airport airportDeparture,
              Airport airportArrival, Aircraft aircraft, Airline airline,
              LocalDate departureDate, LocalDate arrivalDate) {
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.airportDeparture = airportDeparture;
        this.airportArrival = airportArrival;
        this.aircraft = aircraft;
        this.airline = airline;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
    }

    /** Gets the departure time of the flight.
     * @return  A string representing the departure time of the flight.
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /** Gets the arrival time of the flight.
     * @return  A string representing the arrival time of the flight.
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /** Gets the departure airport.
     * @return  The departure airport object.
     */
    public Airport getAirportDeparture() {
        return airportDeparture;
    }

    /** Gets the arrival airport.
     * @return  The arrival airport object.
     */
    public Airport getAirportArrival() {
        return airportArrival;
    }

    /** Gets the aircraft.
     * @return  The aircraft object of the flight.
     */
    public Aircraft getAircraft() {
        return aircraft;
    }

    /** Gets the airline.
     * @return  The airline object of the flight.
     */
    public Airline getAirline() {
        return airline;
    }

    /** Gets the departure date of the flight.
     * @return  The departure date of the flight.
     */
    public LocalDate getDepartureDate() {
        return departureDate;
    }

    /** Gets the arrival date of the flight.
     * @return  The arrival date of the flight.
     */
    public LocalDate getArrivalDate() {
        return arrivalDate;
    }
}
