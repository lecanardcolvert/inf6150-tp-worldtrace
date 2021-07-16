package ca.uqam.inf6150.ete2021.gr010.flight;
/** Represents an airport.
 * @author WorldTrace Corporation
 * @version 1.0
 */

public class Airport {
    private final City city;
    private final String iataCode;
    private final String name;

    /**
     * Airport constructor.
     * @param city      The city of the airport.
     * @param iataCode  The IATA code of the airport.
     * @param name      The name of the airport.
     */
    Airport(City city, String iataCode, String name) {
        this.city = city;
        this.iataCode = iataCode;
        this.name = name;
    }

    /** Gets the city.
     * @return  The city object associated to the airport.
     */
    public City getCity() {
        return this.city;
    }

    /** Gets the IATA code.
     * @return  A string representing the IATA code of the airport.
     *          For example, YUL for Montreal Pierre-Eliott-Trudeau airport.
     */
    public String getIataCode() {
        return this.iataCode;
    }

    /** Gets the name of the airport.
     * @return  A string representing the name of the airport.
     */
    public String getName() {
        return this.name;
    }
}
