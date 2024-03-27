package za.ac.cput.factory;

import za.ac.cput.domain.MaintenanceLog;

/*
    Paul Maja 220214115
    25 March 2023
 */
public class MaintenanceLogFactory {
    public static MaintenanceLog createMaintenanceLog(String carID, String maintenanceDate, String maintenanceType,
                                                      String cost, String mileage) {
        return new MaintenanceLog.Builder()
                .setCarID(carID)
                .setMaintenanceDate(maintenanceDate)
                .setMaintenanceType(maintenanceType)
                .setCost(cost)
                .setMileage(mileage)
                .build();
    }
}


