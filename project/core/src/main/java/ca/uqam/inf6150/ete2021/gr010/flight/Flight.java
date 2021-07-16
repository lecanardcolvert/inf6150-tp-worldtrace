package ca.uqam.inf6150.ete2021.gr010.flight;
/** Represents a plane flight.
 * @author WorldTrace Corporation
 * @version 1.0
 */

import java.time.LocalDate;

public class Flight {
    private String departureTime;
    private String arrivalTime;
    private Airport airportDeparture;
    private Airport airportArrival;
    private Aircraft aircraft;
    private Airline airline;
    private LocalDate departureDate;
    private LocalDate arrivalDate;

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
