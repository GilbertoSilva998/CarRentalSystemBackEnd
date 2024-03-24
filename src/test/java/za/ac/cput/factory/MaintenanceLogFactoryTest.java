package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.MaintenanceLog;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceLogFactoryTest {

    @Test
    void createMaintenanceLog() {
        // Arrange
        int carID = 101;
        Date maintenanceDate = new Date();
        String maintenanceType = "Oil change";
        double maintenanceCost = 150.0;
        int mileageAtMaintenance = 5000;

        // Act
        MaintenanceLog maintenanceLog = MaintenanceLogFactory.createMaintenanceLog(carID, maintenanceDate,
                maintenanceType, maintenanceCost, mileageAtMaintenance);

        // Assert
        assertNotNull(maintenanceLog);
        assertEquals(carID, maintenanceLog.getCarID());
        assertEquals(maintenanceDate, maintenanceLog.getMaintenanceDate());
        assertEquals(maintenanceType, maintenanceLog.getMaintenanceType());
        assertEquals(maintenanceCost, maintenanceLog.getCost());
        assertEquals(mileageAtMaintenance, maintenanceLog.getMileage());
    }
}
