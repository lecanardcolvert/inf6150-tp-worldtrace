package ca.uqam.inf6150.ete2021.gr010.flight;

public class Airport {
    private final int    m_id;

    private  City city;
    private  String iataCode;
    private  String name;


    public City getCity() {
        return this.city;
    }

    public String getIataCode() {
        return this.iataCode;
    }

    public String getName() {
        return this.name;
    }
}
