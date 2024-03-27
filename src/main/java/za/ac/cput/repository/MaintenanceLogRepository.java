package za.ac.cput.repository;

import za.ac.cput.domain.MaintenanceLog;

import java.util.List;
/*
    Paul Maja 220214115
    25 March 2024
 */
public interface MaintenanceLogRepository {
    void addMaintenanceLog(MaintenanceLog maintenanceLog);

    List<MaintenanceLog> getAllMaintenanceLogs();

    MaintenanceLog getMaintenanceLogById(String carID);


    void updateMaintenanceLog(MaintenanceLog updatedMaintenanceLog);

    void deleteMaintenanceLog(String carID);
}
