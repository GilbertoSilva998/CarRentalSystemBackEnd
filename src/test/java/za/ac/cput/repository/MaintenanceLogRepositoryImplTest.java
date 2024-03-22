package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.MaintenanceLog;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceLogRepositoryTest {

    @Test
    void addMaintenanceLog() {
        // Arrange
        MaintenanceLogRepository repository = new MaintenanceLogRepositoryImpl();
        MaintenanceLog maintenanceLog = new MaintenanceLog(101, null, "Oil change", 150.0, 5000);

        // Act
        repository.addMaintenanceLog(maintenanceLog);

        // Assert
        List<MaintenanceLog> allMaintenanceLogs = repository.getAllMaintenanceLogs();
        assertTrue(allMaintenanceLogs.contains(maintenanceLog));
    }

    @Test
    void getAllMaintenanceLogs() {
        // Test will depend on the implementation of MaintenanceLogRepository,
        // verifying that all maintenance logs are retrieved correctly.
    }

    @Test
    void getMaintenanceLogById() {
        // Arrange
        MaintenanceLogRepository repository = new MaintenanceLogRepositoryImpl();
        MaintenanceLog maintenanceLog = new MaintenanceLog(101, null, "Oil change", 150.0, 5000);
        repository.addMaintenanceLog(maintenanceLog);

        // Act
        MaintenanceLog retrievedLog = repository.getMaintenanceLogById(101);

        // Assert
        assertNotNull(retrievedLog);
        assertEquals(maintenanceLog, retrievedLog);
    }

    @Test
    void updateMaintenanceLog() {
        // Arrange
        MaintenanceLogRepository repository = new MaintenanceLogRepositoryImpl();
        MaintenanceLog maintenanceLog = new MaintenanceLog(101, null, "Oil change", 150.0, 5000);
        repository.addMaintenanceLog(maintenanceLog);

        // Create an updated maintenance log
        MaintenanceLog updatedMaintenanceLog = new MaintenanceLog(101, null, "Brake replacement", 300.0, 5500);

        // Act
        repository.updateMaintenanceLog(updatedMaintenanceLog);

        // Assert
        MaintenanceLog retrievedLog = repository.getMaintenanceLogById(101);
        assertEquals(updatedMaintenanceLog, retrievedLog);
    }

    @Test
    void deleteMaintenanceLog() {
        // Arrange
        MaintenanceLogRepository repository = new MaintenanceLogRepositoryImpl();
        MaintenanceLog maintenanceLog = new MaintenanceLog(101, null, "Oil change", 150.0, 5000);
        repository.addMaintenanceLog(maintenanceLog);

        // Act
        repository.deleteMaintenanceLog(101);

        // Assert
        MaintenanceLog deletedLog = repository.getMaintenanceLogById(101);
        assertNull(deletedLog);
    }
}
