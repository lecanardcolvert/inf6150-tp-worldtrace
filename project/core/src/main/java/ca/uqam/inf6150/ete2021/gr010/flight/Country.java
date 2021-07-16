package ca.uqam.inf6150.ete2021.gr010.flight;

public class Country {
    private final String name;

    /**
     * Country constructor.
     * @param name  The name of the country.
     */
    Country(String name) {
        this.name = name;
    }

    /** Gets the name of the country.
     * @return  A string representing the name of the country.
     */
    public String getName() {
        return this.name;
    }

}
