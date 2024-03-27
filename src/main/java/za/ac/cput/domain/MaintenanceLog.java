package za.ac.cput.domain;

import java.util.Objects;
/*
    Paul Maja 220214115
    25 March 2024
 */
public class MaintenanceLog {
    private String carID;
    private String maintenanceDate;
    private String maintenanceType;
    private String cost;
    private String mileage;

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
    public String getCarID() {
        return carID;
    }

    public String getMaintenanceDate() {
        return maintenanceDate;
    }

    public String getMaintenanceType() {
        return maintenanceType;
    }

    public String  getCost() {
        return cost;
    }

    public String getMileage() {
        return mileage;
    }

    // Builder
    public static class Builder {
        private String carID;
        private String maintenanceDate;
        private String maintenanceType;
        private String cost;
        private String mileage;

        public Builder setCarID(String carID) {
            this.carID = carID;
            return this;
        }

        public Builder setMaintenanceDate(String maintenanceDate) {
            this.maintenanceDate = maintenanceDate;
            return this;
        }

        public Builder setMaintenanceType(String maintenanceType) {
            this.maintenanceType = maintenanceType;
            return this;
        }

        public Builder setCost(String cost) {
            this.cost = cost;
            return this;
        }

        public Builder setMileage(String mileage) {
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
        return Objects.equals(carID, that.carID) && Objects.equals(maintenanceDate, that.maintenanceDate) && Objects.equals(maintenanceType, that.maintenanceType) && Objects.equals(cost, that.cost) && Objects.equals(mileage, that.mileage);
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

