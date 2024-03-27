package za.ac.cput.domain;

/* Staff.java
Author: Mickley Khoza (219457670)
Date: 21 March 2024
*/

public class Staff {

    private String staffId;
    private String name;
    private String role;
    private String contactInfo;
    private String shiftSchedule;

    //Constructor
    private Staff() {
    }

    private Staff(Builder builder) {
        this.staffId = builder.staffId;
        this.name = builder.name;
        this.role = builder.role;
        this.contactInfo = builder.contactInfo;
        this.shiftSchedule = builder.shiftSchedule;
    }

    //Getters
    public String getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getShiftSchedule() {
        return shiftSchedule;
    }


    @Override
    public String toString() {
        return "Staff{" +
                "staffId='" + staffId + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", shiftSchedule='" + shiftSchedule + '\'' +
                '}';
    }

    // Builder class
    public static class Builder {
        private String staffId;
        private String name;
        private String role;
        private String contactInfo;
        private String shiftSchedule;

        // Setters
        public Builder setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public Builder setContactInfo(String contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }

        public Builder setShiftSchedule(String shiftSchedule) {
            this.shiftSchedule = shiftSchedule;
            return this;
        }

        public Builder copy(Staff staff) {
            this.staffId = staff.staffId;
            this.name = staff.name;
            this.role = staff.role;
            this.contactInfo = staff.contactInfo;
            this.shiftSchedule = staff.shiftSchedule;
            return this;
        }


        public Staff build() {
            return new Staff(this);
        }
    }
}



