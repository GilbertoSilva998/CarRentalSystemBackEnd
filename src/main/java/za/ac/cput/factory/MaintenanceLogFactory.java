package za.ac.cput.factory;

import za.ac.cput.domain.MaintenanceLog;

import java.util.Date;
/*
    Paul Maja 220214115
    24 March 2023
 */
public class MaintenanceLogFactory {
    public static MaintenanceLog createMaintenanceLog(int carID, Date maintenanceDate, String maintenanceType,
                                                      double cost, int mileage) {
        return new MaintenanceLog.Builder()
                .setCarID(carID)
                .setMaintenanceDate(maintenanceDate)
                .setMaintenanceType(maintenanceType)
                .setCost(cost)
                .setMileage(mileage)
                .build();
    }
}


