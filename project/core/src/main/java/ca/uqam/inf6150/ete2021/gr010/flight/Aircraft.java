package ca.uqam.inf6150.ete2021.gr010.flight;
/** Represents an aircraft.
 * @author WorldTrace Corporation
 * @version 1.0
 */

public class Aircraft {
    private Manufacturer manufacturer;
    private String model;

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
