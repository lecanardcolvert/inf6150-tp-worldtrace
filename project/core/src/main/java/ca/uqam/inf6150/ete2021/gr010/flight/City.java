package ca.uqam.inf6150.ete2021.gr010.flight;
/** Represents a city.
 * @author WorldTrace Corporation
 * @version 1.0
 */

public class City {
    private Country country;
    private String name;
    private double latitude;
    private double longitude;

    /** Gets the country.
     * @return  The country object associated to the city.
     */
    public Country getCountry() {
        return this.country;
    }

    /** Gets the name of the city.
     * @return  A string representing the name of the city.
     */
    public String getName() {
        return this.name;
    }

    /** Gets the latitude of the city.
     * @return  A double representing the latitude of the city.
     *          From -90 (West) to 90 (East).
     */
    public double getLatitude() {
        return this.latitude;
    }

    /** Gets the longitude of the city.
     * @return  A double representing the longitude of the city.
     *          From -180 (South) to 180 (North).
     */
    public double getLongitude() {
        return this.longitude;
    }
}
