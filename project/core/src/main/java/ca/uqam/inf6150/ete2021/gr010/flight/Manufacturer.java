package ca.uqam.inf6150.ete2021.gr010.flight;

public class Manufacturer {
    private final String name;

    /**
     * Manufacturer constructor.
     * @param name  The name of the manufacturer.
     */
    Manufacturer(String name) {
        this.name = name;
    }

    /** Gets the name of an aircraft manufacturer.
     * @return  A string representing the name of the manufacturer.
     */
    public String getName() {
        return this.name;
    }
}
