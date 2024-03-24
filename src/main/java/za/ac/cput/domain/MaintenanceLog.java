package za.ac.cput.domain;

// MaintenanceLog.java
import java.util.Date;
/*
  Paul Maja 220214115
  21 March 2024
 */
public class MaintenanceLog {
    private int carID;
    private Date maintenanceDate;
    private String maintenanceType;
    private double cost;
    private int mileage;

    // Constructors
    public MaintenanceLog() {}

    public MaintenanceLog(int carID, Date maintenanceDate, String maintenanceType, double cost, int mileage) {
        this.carID = carID;
        this.maintenanceDate = maintenanceDate;
        this.maintenanceType = maintenanceType;
        this.cost = cost;
        this.mileage = mileage;
    }

    // Getters and setters
    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public Date getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(Date maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    public String getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(String maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}

