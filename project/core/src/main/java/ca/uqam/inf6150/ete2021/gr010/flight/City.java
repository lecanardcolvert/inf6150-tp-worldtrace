package ca.uqam.inf6150.ete2021.gr010.flight;

public class City {
    private final int    m_id;

    private  Country country;
    private  String name;
    private  double latitude;
    private  double longitude;

    public Country getCountry() {
        return this.country;
    }

    public String getName() {
        return this.name;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }
}
