package ca.uqam.inf6150.ete2021.gr010.flight;
/** Represents an airport.
 * @author WorldTrace Corporation
 * @version 1.0
 */

public class Airport {
    private City city;
    private String iataCode;
    private String name;

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
