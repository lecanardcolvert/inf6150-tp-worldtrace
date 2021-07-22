package ca.uqam.inf6150.ete2021.gr010;

import ca.uqam.inf6150.ete2021.gr010.flight.api.FlightAPI;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TestsFlightApi {
    //Test de la méthode FlightAPI.getall()
    @Test
    public void testDepart() throws SQLException {
        Timestamp TimeStampDepart = Collections.singletonList(FlightAPI.fetchAll().get(1).getDeparture()).get(0);
        Timestamp testTimeStampDepart = Timestamp.valueOf("2022-01-12 03:30:00.0");
        assertEquals(testTimeStampDepart,TimeStampDepart);
    }

    //Test de la méthode FlightAPI.getall()
    @Test
    public void testArrive() throws SQLException {
        Timestamp TimeStampArrive = Collections.singletonList(FlightAPI.fetchAll().get(5).getArrival()).get(0);
        Timestamp testTimeStampArrive = Timestamp.valueOf("2021-12-12 21:00:00.0");
        assertEquals(testTimeStampArrive,TimeStampArrive);
    }

    //Test de la méthode FlightAPI.getall()
    @Test
    public void testPaysDepart() throws SQLException {
        String pays = FlightAPI.fetchAll().get(8).getBeginAirport().getCity().getCountry().getName();
        assertEquals("Taîwan",pays);
    }

    //Test de la méthode FlightAPI.getall()
    @Test
    public void testManufacturier() throws SQLException {
        String manufacturier = FlightAPI.fetchAll().get(17).getAircraft().getManufacturer().getName();
        assertNotEquals("Airbus",manufacturier);
    }

    //Test de la méthode FlightAPI.getDao()
    @Test
    public void testNombreVols() throws  SQLException {
        assertEquals(30,FlightAPI.getDao().countOf());
    }

    //Test de la méthode FlightAPI.getDao()
    @Test
    public void testFlight() throws  SQLException {
       assertEquals("FLIGHT",FlightAPI.getDao().getTableName());
    }

    //Test de la méthode FlightAPI.getall()
    @Test
    public void testCoordonnesArriveeLat() throws SQLException {
        double testCoorArr = FlightAPI.fetchAll().get(27).getEndAirport().getCity().getLatitude();
        assertEquals(-4.2634,testCoorArr);
    }

    //Test de la méthode FlightAPI.getall()
    @Test
    public void testCoordonnesDepLong() throws SQLException {
        double testCoorDep= FlightAPI.fetchAll().get(14).getBeginAirport().getCity().getLongitude();
        assertEquals(-75.6972,testCoorDep);
    }

    @Test
    public void testLatestDepart() throws SQLException {
        Timestamp TimestampDepart = FlightAPI.fetchForemostInTime().getDeparture();
        Timestamp testTimeStampDepart = Timestamp.valueOf("2022-02-10 21:05:00.0");
        assertEquals(testTimeStampDepart,TimestampDepart);
    }

    @Test
    public void testLatestAirline() throws SQLException {
        String airline = FlightAPI.fetchForemostInTime().getAirline().getName();
        assertEquals("Vietnam National Airlines",airline);
    }


}