package ca.uqam.inf6150.ete2021.gr010.flight;

public class City {
    private final Country country;
    private final String name;
    private final double latitude;
    private final double longitude;

    /**
     * City constructor.
     * @param country   The country of the city.
     * @param name      The name of the city.
     * @param latitude  The latitude of the city.
     * @param longitude The longitude of the city.
     */
    City(Country country, String name, double latitude, double longitude) {
        this.country = country;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

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
