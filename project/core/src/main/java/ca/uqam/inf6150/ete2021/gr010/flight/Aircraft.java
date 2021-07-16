package ca.uqam.inf6150.ete2021.gr010.flight;
/** Represents an aircraft.
 * @author WorldTrace Corporation
 * @version 1.0
 */

public class Aircraft {
    private final Manufacturer manufacturer;
    private final String model;

    /**
     * Aircraft constructor.
     * @param manufacturer  The manufacturer of the aircraft.
     * @param model         The model of the aircraft.
     */
    Aircraft(Manufacturer manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    /** Gets the aircraft manufacturer.
     * @return  The aircraft manufacturer object.
     */
    public Manufacturer getManufacturer() {
        return this.manufacturer;
    }

    /** Gets the aircraft model name.
     * @return  A string representing the model number.
     */
    public String getModel() {
        return this.model;
    }
}
