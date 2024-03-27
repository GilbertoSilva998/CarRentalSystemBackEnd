package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.MaintenanceLog;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/*
    Paul Maja 220214115
    25 March 2023
 */
class MaintenanceLogRepositoryTest {

    @Test
    void addMaintenanceLog() {
        MaintenanceLogRepository repository = new MaintenanceLogRepositoryImpl();
        MaintenanceLog maintenanceLog = new MaintenanceLog.Builder()
                .setCarID("101")
                .setMaintenanceDate(null)
                .setMaintenanceType("Oil change")
                .setCost("150.0")
                .setMileage("5000")
                .build();
        repository.addMaintenanceLog(maintenanceLog);

        // Assert
        List<MaintenanceLog> allMaintenanceLogs = repository.getAllMaintenanceLogs();
        assertTrue(allMaintenanceLogs.contains(maintenanceLog));
    }

    @Test
    void getAllMaintenanceLogs() {
        // Arrange
        MaintenanceLogRepository repository = new MaintenanceLogRepositoryImpl();

        // Create sample maintenance logs
        MaintenanceLog maintenanceLog1 = new MaintenanceLog.Builder()
                .setCarID("101")
                .setMaintenanceDate(null)
                .setMaintenanceType("Oil change")
                .setCost("150.0")
                .setMileage("5000")
                .build();

        MaintenanceLog maintenanceLog2 = new MaintenanceLog.Builder()
                .setCarID("102")
                .setMaintenanceDate(null)
                .setMaintenanceType("Brake replacement")
                .setCost("300.0")
                .setMileage("5500")
                .build();

        repository.addMaintenanceLog(maintenanceLog1);
        repository.addMaintenanceLog(maintenanceLog2);

        List<MaintenanceLog> allMaintenanceLogs = repository.getAllMaintenanceLogs();

        // Assert
        assertEquals(2, allMaintenanceLogs.size());
        assertTrue(allMaintenanceLogs.contains(maintenanceLog1));
        assertTrue(allMaintenanceLogs.contains(maintenanceLog2));
    }

    @Test
    void getMaintenanceLogById() {
        MaintenanceLogRepository repository = new MaintenanceLogRepositoryImpl();
        MaintenanceLog maintenanceLog = new MaintenanceLog.Builder()
                .setCarID("101")
                .setMaintenanceDate(null)
                .setMaintenanceType("Oil change")
                .setCost("150.0")
                .setMileage("5000")
                .build();
        repository.addMaintenanceLog(maintenanceLog);

        MaintenanceLog retrievedLog = repository.getMaintenanceLogById("101");

        // Assert
        assertNotNull(retrievedLog);
        assertEquals(maintenanceLog, retrievedLog);
    }

    @Test
    void updateMaintenanceLog() {
        // Arrange
        MaintenanceLogRepository repository = new MaintenanceLogRepositoryImpl();
        MaintenanceLog maintenanceLog = new MaintenanceLog.Builder()
                .setCarID("101")
                .setMaintenanceDate(null)
                .setMaintenanceType("Oil change")
                .setCost("150.0")
                .setMileage("5000")
                .build();
        repository.addMaintenanceLog(maintenanceLog);

        // Create an updated maintenance log
        MaintenanceLog updatedMaintenanceLog = new MaintenanceLog.Builder()
                .setCarID("101")
                .setMaintenanceDate(null)
                .setMaintenanceType("Brake replacement")
                .setCost("300.0")
                .setMileage("5500")
                .build();

        // Act
        repository.updateMaintenanceLog(updatedMaintenanceLog);

        // Assert
        MaintenanceLog retrievedLog = repository.getMaintenanceLogById("101");
        assertEquals(updatedMaintenanceLog, retrievedLog);
    }

    @Test
    void deleteMaintenanceLog() {
        // Arrange
        MaintenanceLogRepository repository = new MaintenanceLogRepositoryImpl();
        MaintenanceLog maintenanceLog = new MaintenanceLog.Builder()
                .setCarID("101")
                .setMaintenanceDate(null)
                .setMaintenanceType("Oil change")
                .setCost("150.0")
                .setMileage("5000")
                .build();
        repository.addMaintenanceLog(maintenanceLog);

        // Act
        repository.deleteMaintenanceLog("101");

        // Assert
        MaintenanceLog deletedLog = repository.getMaintenanceLogById("101");
        assertNull(deletedLog);
    }
}
