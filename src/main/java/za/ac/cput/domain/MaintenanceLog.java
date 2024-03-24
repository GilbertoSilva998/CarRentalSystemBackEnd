package za.ac.cput.domain;

import java.util.Date;
import java.util.Objects;
/*
    Paul Maja 220214115
    24 March 2023
 */
public class MaintenanceLog {
    private int carID;
    private Date maintenanceDate;
    private String maintenanceType;
    private double cost;
    private int mileage;

    // Constructor
    public MaintenanceLog() {}

    public MaintenanceLog(Builder builder) {
        this.carID = builder.carID;
        this.maintenanceDate = builder.maintenanceDate;
        this.maintenanceType = builder.maintenanceType;
        this.cost = builder.cost;
        this.mileage = builder.mileage;
    }

    // Getters
    public int getCarID() {
        return carID;
    }

    public Date getMaintenanceDate() {
        return maintenanceDate;
    }

    public String getMaintenanceType() {
        return maintenanceType;
    }

    public double getCost() {
        return cost;
    }

    public int getMileage() {
        return mileage;
    }

    // Builder
    public static class Builder {
        private int carID;
        private Date maintenanceDate;
        private String maintenanceType;
        private double cost;
        private int mileage;

        public Builder setCarID(int carID) {
            this.carID = carID;
            return this;
        }

        public Builder setMaintenanceDate(Date maintenanceDate) {
            this.maintenanceDate = maintenanceDate;
            return this;
        }

        public Builder setMaintenanceType(String maintenanceType) {
            this.maintenanceType = maintenanceType;
            return this;
        }

        public Builder setCost(double cost) {
            this.cost = cost;
            return this;
        }

        public Builder setMileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        public MaintenanceLog build() {
            return new MaintenanceLog(this);
        }
    }

    // Equals, HashCode, ToString methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaintenanceLog that = (MaintenanceLog) o;
        return carID == that.carID &&
                Double.compare(that.cost, cost) == 0 &&
                mileage == that.mileage &&
                Objects.equals(maintenanceDate, that.maintenanceDate) &&
                Objects.equals(maintenanceType, that.maintenanceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carID, maintenanceDate, maintenanceType, cost, mileage);
    }

    @Override
    public String toString() {
        return "MaintenanceLog{" +
                "carID=" + carID +
                ", maintenanceDate=" + maintenanceDate +
                ", maintenanceType='" + maintenanceType + '\'' +
                ", cost=" + cost +
                ", mileage=" + mileage +
                '}';
    }
}

