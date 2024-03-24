package za.ac.cput.factory;
import za.ac.cput.domain.MaintenanceLog;
import java.util.Date;

public class MaintenanceLogFactory {

    public static MaintenanceLog createMaintenanceLog(int carID, Date maintenanceDate, String maintenanceType,
                                                      double maintenanceCost, int mileageAtMaintenance) {
        MaintenanceLog maintenanceLog = new MaintenanceLog();
        maintenanceLog.setCarID(carID);
        maintenanceLog.setMaintenanceDate(maintenanceDate);
        maintenanceLog.setMaintenanceType(maintenanceType);
        maintenanceLog.setCost(maintenanceCost);
        maintenanceLog.setMileage(mileageAtMaintenance);
        return maintenanceLog;
    }
}

