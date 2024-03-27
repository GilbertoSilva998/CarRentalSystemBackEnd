package za.ac.cput.repository;
/* LocationRepositoryTest.java
Author: Mickley Khoza (219457670)
Date: 25 March 2024
*/

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Car;
import za.ac.cput.domain.Location;
import za.ac.cput.domain.Staff;
import za.ac.cput.factory.LocationFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;




public class LocationRepositoryTest {

    private static final LocationRepository locationRepo = LocationRepository.getLocationRepository();
    private static final Location location = LocationFactory.createLocation(
            "1",
            "123 Main St",
            new ArrayList<>(),
            new ArrayList<>(),
            "9:00 AM - 5:00 PM"
    );





    @Test
    @Order(1)
    void create() {

        Location created = locationRepo.create(location);
        assertNotNull(created);
        assertEquals(location.getLocationId(), created.getLocationId());
        System.out.println("Created " + created);
    }

    @Test
    @Order(2)
    void read() {
        assertNotNull(location);
        Location read = locationRepo.create(location);
        assertNotNull(read);
        assertEquals(location.getLocationId(), read.getLocationId());
        System.out.println("Read " + read);


    }

    @Test
    @Order(3)
    void update() {
        assertNotNull(location);
        List<Car> updatedAvailableCars = new ArrayList<>();
        List<Staff> updatedStaffInfo = new ArrayList<>();
        Location updated = new Location.Builder().copy(location)
                .setLocationId("2")
                .setAddress("10 varsity str")
                .setAvailableCars(updatedAvailableCars)
                .setStaffInfo(updatedStaffInfo)
                .setOperatingHours("10:00 AM - 5:00 PM")
                .build();
        assertNotNull(updated);
        System.out.println("Updated " + updated);
    }

    @Test
    @Order(4)
    void
    delete() {
        assertNotNull(location);
        Location created = locationRepo.create(location);
        assertNotNull(created);
        String locationId = created.getLocationId();
        boolean deleted = locationRepo.delete(locationId);
        assertTrue(deleted, "Deletion of location with ID " + locationId + " failed");
        System.out.println("Deleted " + locationId);
    }

    @Test
    @Order(5)
    void getAll() {
        System.out.println("Show all: ");
        System.out.println(locationRepo.getAll());
    }
}
