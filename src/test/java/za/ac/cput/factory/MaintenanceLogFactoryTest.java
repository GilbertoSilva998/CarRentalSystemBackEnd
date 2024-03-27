package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.MaintenanceLog;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
/*
    Paul Maja 220214115
    25 March 2024
 */
class MaintenanceLogFactoryTest {

    @Test
    void createMaintenanceLog() {
        // Arrange
        String carID = "101";
        String maintenanceDate = "Fist week of the Month";
        String maintenanceType = "Oil change";
        String maintenanceCost = "150.0";
        String mileageAtMaintenance = "5000";


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
