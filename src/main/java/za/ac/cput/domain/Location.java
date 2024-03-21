package za.ac.cput.domain;

/* Location.java
Author: Mickley Khoza (219457670)
Date: 21 March 2024
*/

import java.util.List;
public class Location {

    private String locationId;
    private String address;
    private List<Car> availableCars;
    private List<Staff> staffInfo;
    private String operatingHours;

    //Contructor
    private Location() {}

    private Location(Builder builder) {
        this.locationId = builder.locationId;
        this.address = builder.address;
        this.availableCars = builder.availableCars;
        this.staffInfo = builder.staffInfo;
        this.operatingHours = builder.operatingHours;
    }

    // Getters
    public String getLocationId() {
        return locationId;
    }

    public String getAddress() {
        return address;
    }

    public List<Car> getAvailableCars() {
        return availableCars;
    }

    public List<Staff> getStaffInfo() {
        return staffInfo;
    }

    public String getOperatingHours() {
        return operatingHours;
    }


    @Override
    public String toString() {
        return "Location{" +
                "locationId='" + locationId + '\'' +
                ", address='" + address + '\'' +
                ", availableCars=" + availableCars +
                ", staffInfo=" + staffInfo +
                ", operatingHours='" + operatingHours + '\'' +
                '}';
    }

    // Builder class
    public static class Builder {
        private String locationId;
        private String address;
        private List<Car> availableCars;
        private List<Staff> staffInfo;
        private String operatingHours;


        //Setters
        public Builder setLocationId(String locationId) {
            this.locationId = locationId;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setAvailableCars(List<Car> availableCars) {
            this.availableCars = availableCars;
            return this;
        }

        public Builder setStaffInfo(List<Staff> staffInfo) {
            this.staffInfo = staffInfo;
            return this;
        }

        public Builder setOperatingHours(String operatingHours) {
            this.operatingHours = operatingHours;
            return this;
        }

        public Location build() {
            return new Location(this);
        }
    }


}
