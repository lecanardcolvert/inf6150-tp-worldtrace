package ca.uqam.inf6150.ete2021.gr010;

import ca.uqam.inf6150.ete2021.gr010.flight.api.FlightAPI;
import ca.uqam.inf6150.ete2021.gr010.flight.model.Flight;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestsFlightApi {
    //Test de la méthode FlightAPI.getall()
    @Test
    public void testFumeur() throws SQLException {
        List<Flight> e = Collections.singletonList(FlightAPI.getAll().get(1));
        List<Flight> e2 = FlightAPI.getAll().subList(2,3);
        List<Flight> e3 = FlightAPI.getAll().subList(3,4);
        Timestamp t = Collections.singletonList(FlightAPI.getAll().get(1).getDeparture()).get(0);
        Timestamp testTimestamp = Timestamp.valueOf("2022-01-12 03:30:00.0");
        System.out.println(testTimestamp);
        System.out.println("\n\n\n+++++++++++++++++++++++++++++"+e+"++++++++++++++++++++++++\n\n\n\n\n");
        System.out.println("\n\n\n+++++++++++++++++++++++++++++"+e2+"++++++++++++++++++++++++\n\n\n\n\n");
        System.out.println("\n\n\n+++++++++++++++++++++++++++++"+e3+"++++++++++++++++++++++++\n\n\n\n\n");
        System.out.println("\n\n\n+++++++++++++++++++++++++++++"+t+"++++++++++++++++++++++++\n\n\n\n\n");
        System.out.println("\n\n\n+++++++++++++++++++++++++++++"+testTimestamp+"++++++++++++++++++++++++\n\n\n\n\n");
        assertEquals(testTimestamp,t);
    }


}