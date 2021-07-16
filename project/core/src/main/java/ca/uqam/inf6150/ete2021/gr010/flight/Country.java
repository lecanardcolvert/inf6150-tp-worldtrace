package ca.uqam.inf6150.ete2021.gr010.flight;

public class Country {

    private final int    m_id;
    private       String name;

    Country(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
