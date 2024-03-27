package za.ac.cput.repository;
/* StaffRepositoryTest.java
Author: Mickley Khoza (219457670)
Date: 25 March 2024
*/

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Car;
import za.ac.cput.domain.Location;
import za.ac.cput.domain.Staff;
import za.ac.cput.factory.LocationFactory;
import za.ac.cput.factory.StaffFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StaffRepositoryTest {
    private static final StaffRepository staffRepo = StaffRepository.getStaffRepository();
    private static final Staff staff = StaffFactory.createStaff(
                                                   "S001",
                                                   "John Doe",
                                                    "Manager",
                                               "john@example.com",
                                              "9:00 AM - 5:00 PM");

    @Test
    @Order(1)
    void create() {
        Staff created = staffRepo.create(staff);
        assertNotNull(created);
        assertEquals(staff.getStaffId(), created.getStaffId());
        System.out.println("Created " + created);
    }


    @Test
    @Order(2)
    void read() {
        assertNotNull(staff);
        Staff read = staffRepo.create(staff);
        assertNotNull(read);
        assertEquals(staff.getStaffId(), read.getStaffId());
        System.out.println("Read " + read);
    }


    @Test
    @Order(3)
    void update() {
        assertNotNull(staff);
        Staff updated = new Staff.Builder().copy(staff)
                .setStaffId("S002")
                .setName("Kelly Khoza")
                .setRole("Assistant")
                .setContactInfo("kelly@gmail.com")
                .setShiftSchedule("8:00 AM - 4:00 PM")
                .build();
        assertNotNull(updated);
        System.out.println("Updated " + updated);
    }

    @Test
    @Order(4)
    void delete() {
        assertNotNull(staff);
        Staff created = staffRepo.create(staff);
        assertNotNull(created);
        String staffId = created.getStaffId();
        boolean deleted = staffRepo.delete(staffId);
        assertTrue(deleted, "Deletion of staff with ID " + staffId + " failed");
        System.out.println("Deleted " + staffId);
    }


    @Test
    @Order(5)
    void getAll() {
        System.out.println("Show all: ");
        System.out.println(staffRepo.getAll());
    }


}


