package za.ac.cput.factory;
/* LocationFactoryTest.java
Author: Mickley Khoza (219457670)
Date: 25 March 2024
*/


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.domain.Location;
import org.junit.jupiter.api.BeforeEach;

class LocationFactoryTest {
    private Location location1;
    private Location location2;
    private Location location3;


    @Test
    public void testCreateLocation() {
        Location location = LocationFactory.createLocation(
                "1",
                "123 Main St",
                new ArrayList<>(),
                new ArrayList<>(),
                "9:00 AM - 5:00 PM"

        );

        assertNotNull(location);
        assert location != null;
        System.out.println(location.toString());
    }

    @Test
    void testEquality() {
        assertEquals(location1, location3);
    }

    @Test
    void testIdentity() {
        assertSame(location1, location3);
    }

    @Test
    void testFail() {
        assertEquals(location1, location2);
    }

    @Test
    @Timeout(value = 10000, unit = TimeUnit.MILLISECONDS)
    void testTimeout() {
        System.out.println("Time has passed");
    }

    @Test
    @Disabled("Disabled ERROR 808")
    void testWillBeSkipped() {

    }
}