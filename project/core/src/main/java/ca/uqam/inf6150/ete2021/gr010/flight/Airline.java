package ca.uqam.inf6150.ete2021.gr010.flight;

public class Airline {
    private final String name;

    /**
     * Airline constructor.
     * @param name  The name of the airline.
     */
    Airline(String name) {
        this.name = name;
    }

    /** Gets the airline name.
     * @return  A string representing the airline name.
     */
    public String getName() {
        return this.name;
    }
}
