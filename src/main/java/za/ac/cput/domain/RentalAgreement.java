package za.ac.cput.domain;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
/*
    Paul Maja 220214115
    24 March 2023
 */
public class RentalAgreement {
    private  int agreementID;
    private  int customerID;
    private  int carID;
    private  String pickupLocation;
    private  String dropOffLocation;
    private  Date pickupDateTime;
    private  Date dropOffDateTime;
    private  boolean insuranceCoverage;
    private  String[] additionalServices; // Change to array
    private  String termsAndConditions;

    // Constructor
    public RentalAgreement(){
    }

    public RentalAgreement(Builder builder) {
        this.agreementID = builder.agreementID;
        this.customerID = builder.customerID;
        this.carID = builder.carID;
        this.pickupLocation = builder.pickupLocation;
        this.dropOffLocation = builder.dropOffLocation;
        this.pickupDateTime = builder.pickupDateTime;
        this.dropOffDateTime = builder.dropOffDateTime;
        this.insuranceCoverage = builder.insuranceCoverage;
        this.additionalServices = builder.additionalServices;
        this.termsAndConditions = builder.termsAndConditions;
    }

    // Getters
    public int getAgreementID() {
        return agreementID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getCarID() {
        return carID;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public Date getPickupDateTime() {
        return pickupDateTime;
    }

    public Date getDropOffDateTime() {
        return dropOffDateTime;
    }

    public boolean isInsuranceCoverage() {
        return insuranceCoverage;
    }

    public String[] getAdditionalServices() {
        return additionalServices;
    }

    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    // Builder
    public static class Builder {
        private int agreementID;
        private int customerID;
        private int carID;
        private String pickupLocation;
        private String dropOffLocation;
        private Date pickupDateTime;
        private Date dropOffDateTime;
        private boolean insuranceCoverage;
        private String[] additionalServices;
        private String termsAndConditions;

        public Builder setAgreementID(int agreementID) {
            this.agreementID = agreementID;
            return this;
        }

        public Builder setCustomerID(int customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder setCarID(int carID) {
            this.carID = carID;
            return this;
        }

        public Builder setPickupLocation(String pickupLocation) {
            this.pickupLocation = pickupLocation;
            return this;
        }

        public Builder setDropOffLocation(String dropOffLocation) {
            this.dropOffLocation = dropOffLocation;
            return this;
        }

        public Builder setPickupDateTime(Date pickupDateTime) {
            this.pickupDateTime = pickupDateTime;
            return this;
        }

        public Builder setDropOffDateTime(Date dropOffDateTime) {
            this.dropOffDateTime = dropOffDateTime;
            return this;
        }

        public Builder setInsuranceCoverage(boolean insuranceCoverage) {
            this.insuranceCoverage = insuranceCoverage;
            return this;
        }

        public Builder setAdditionalServices(String[] additionalServices) {
            this.additionalServices = additionalServices;
            return this;
        }

        public Builder setTermsAndConditions(String termsAndConditions) {
            this.termsAndConditions = termsAndConditions;
            return this;
        }

        public RentalAgreement build() {
            return new RentalAgreement(this);
        }
    }

    // Equals, HashCode, ToString methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentalAgreement that = (RentalAgreement) o;
        return agreementID == that.agreementID &&
                customerID == that.customerID &&
                carID == that.carID &&
                insuranceCoverage == that.insuranceCoverage &&
                Objects.equals(pickupLocation, that.pickupLocation) &&
                Objects.equals(dropOffLocation, that.dropOffLocation) &&
                Objects.equals(pickupDateTime, that.pickupDateTime) &&
                Objects.equals(dropOffDateTime, that.dropOffDateTime) &&
                Arrays.equals(additionalServices, that.additionalServices) &&
                Objects.equals(termsAndConditions, that.termsAndConditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agreementID, customerID, carID, pickupLocation, dropOffLocation, pickupDateTime, dropOffDateTime, insuranceCoverage, Arrays.hashCode(additionalServices), termsAndConditions);
    }

    @Override
    public String toString() {
        return "RentalAgreement{" +
                "agreementID=" + agreementID +
                ", customerID=" + customerID +
                ", carID=" + carID +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                ", pickupDateTime=" + pickupDateTime +
                ", dropOffDateTime=" + dropOffDateTime +
                ", insuranceCoverage=" + insuranceCoverage +
                ", additionalServices=" + Arrays.toString(additionalServices) +
                ", termsAndConditions='" + termsAndConditions + '\'' +
                '}';
    }
}
