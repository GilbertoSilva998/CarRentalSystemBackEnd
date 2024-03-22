package za.ac.cput.repository;

import za.ac.cput.domain.MaintenanceLog;

import java.util.List;

public interface MaintenanceLogRepository {
    void addMaintenanceLog(MaintenanceLog maintenanceLog);

    List<MaintenanceLog> getAllMaintenanceLogs();

    MaintenanceLog getMaintenanceLogById(int carID);

    void updateMaintenanceLog(MaintenanceLog updatedMaintenanceLog);

    void deleteMaintenanceLog(int carID);
}
