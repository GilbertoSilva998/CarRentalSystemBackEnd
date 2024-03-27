
package za.ac.cput.repository;

import za.ac.cput.domain.MaintenanceLog;

import java.util.ArrayList;
import java.util.List;
/*
    Paul Maja 220214115
    25 March 2024
 */
public class MaintenanceLogRepositoryImpl implements MaintenanceLogRepository {
    private static final List<MaintenanceLog> maintenanceLogs = new ArrayList<>();

    @Override
    public void addMaintenanceLog(MaintenanceLog maintenanceLog) {
        maintenanceLogs.add(maintenanceLog);
    }

    @Override
    public List<MaintenanceLog> getAllMaintenanceLogs() {
        return maintenanceLogs;
    }

    @Override
    public MaintenanceLog getMaintenanceLogById(String carID) {
        for (MaintenanceLog maintenanceLog : maintenanceLogs) {
            if (maintenanceLog.getCarID() == carID) {
                return maintenanceLog;
            }
        }
        return null;
    }

    @Override
    public void updateMaintenanceLog(MaintenanceLog updatedMaintenanceLog) {
        for (int i = 0; i < maintenanceLogs.size(); i++) {
            MaintenanceLog maintenanceLog = maintenanceLogs.get(i);
            if (maintenanceLog.getCarID() == updatedMaintenanceLog.getCarID()) {
                maintenanceLogs.set(i, updatedMaintenanceLog);
                return;
            }
        }
    }

    @Override
    public void deleteMaintenanceLog(String carID) {
        maintenanceLogs.removeIf(maintenanceLog -> maintenanceLog.getCarID() == carID);
    }
}
