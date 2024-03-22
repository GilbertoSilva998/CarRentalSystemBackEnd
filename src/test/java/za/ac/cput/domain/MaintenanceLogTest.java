package za.ac.cput.domain;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceLogTest {

    @Test
    void testMaintenanceLogObjectCreation() {
        MaintenanceLog maintenanceLog = new MaintenanceLog(101, new Date(), "Oil change", 100.0, 5000);

        //MaintenanceLog maintenanceLog = new MaintenanceLog();
        assertNotNull(maintenanceLog);
    }

    @Test
    void testGettersAndSetters() {
        MaintenanceLog maintenanceLog = new MaintenanceLog();

        maintenanceLog.setCarID(101);
        assertEquals(101, maintenanceLog.getCarID());

        Date maintenanceDate = new Date();
        maintenanceLog.setMaintenanceDate(maintenanceDate);
        assertEquals(maintenanceDate, maintenanceLog.getMaintenanceDate());

        maintenanceLog.setMaintenanceType("Oil change");
        assertEquals("Oil change", maintenanceLog.getMaintenanceType());

        maintenanceLog.setCost(100.0);
        assertEquals(100.0, maintenanceLog.getCost());

        maintenanceLog.setMileage(5000);
        assertEquals(5000, maintenanceLog.getMileage());
    }

    @Test
    void testGetCarID() {
        MaintenanceLog maintenanceLog = new MaintenanceLog();
        maintenanceLog.setCarID(101);
        assertEquals(101, maintenanceLog.getCarID());
    }

    @Test
    void testSetCarID() {
        MaintenanceLog maintenanceLog = new MaintenanceLog();
        maintenanceLog.setCarID(101);
        assertEquals(101, maintenanceLog.getCarID());
    }

    @Test
    void testGetMaintenanceDate() {
        MaintenanceLog maintenanceLog = new MaintenanceLog();
        Date maintenanceDate = new Date();
        maintenanceLog.setMaintenanceDate(maintenanceDate);
        assertEquals(maintenanceDate, maintenanceLog.getMaintenanceDate());
    }

    @Test
    void testSetMaintenanceDate() {
        MaintenanceLog maintenanceLog = new MaintenanceLog();
        Date maintenanceDate = new Date();
        maintenanceLog.setMaintenanceDate(maintenanceDate);
        assertEquals(maintenanceDate, maintenanceLog.getMaintenanceDate());
    }

    @Test
    void testGetMaintenanceType() {
        MaintenanceLog maintenanceLog = new MaintenanceLog();
        maintenanceLog.setMaintenanceType("Oil change");
        assertEquals("Oil change", maintenanceLog.getMaintenanceType());
    }

    @Test
    void testSetMaintenanceType() {
        MaintenanceLog maintenanceLog = new MaintenanceLog();
        maintenanceLog.setMaintenanceType("Oil change");
        assertEquals("Oil change", maintenanceLog.getMaintenanceType());
    }

    @Test
    void testGetCost() {
        MaintenanceLog maintenanceLog = new MaintenanceLog();
        maintenanceLog.setCost(100.0);
        assertEquals(100.0, maintenanceLog.getCost());
    }

    @Test
    void testSetCost() {
        MaintenanceLog maintenanceLog = new MaintenanceLog();
        maintenanceLog.setCost(100.0);
        assertEquals(100.0, maintenanceLog.getCost());
    }

    @Test
    void testGetMileage() {
        MaintenanceLog maintenanceLog = new MaintenanceLog();
        maintenanceLog.setMileage(5000);
        assertEquals(5000, maintenanceLog.getMileage());
    }

    @Test
    void testSetMileage() {
        MaintenanceLog maintenanceLog = new MaintenanceLog();
        maintenanceLog.setMileage(5000);
        assertEquals(5000, maintenanceLog.getMileage());
    }
}
