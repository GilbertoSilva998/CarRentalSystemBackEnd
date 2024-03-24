package za.ac.cput.domain;

import java.util.Date;

public class RentalAgreement {
    private int agreementID;
    private int customerID;
    private int carID;
    private String pickupLocation;
    private String dropOffLocation;
    private Date pickupDateTime;
    private Date dropOffDateTime;
    private boolean insuranceCoverage;
    private String[] additionalServices; // Change to array
    private String termsAndConditions;

    // Constructors
    public RentalAgreement(int agreementID, int customerID, int carID, String pickupLocation,
                           String dropOffLocation, Date pickupDateTime, Date dropOffDateTime,
                           boolean insuranceCoverage, String[] additionalServices, String termsAndConditions) {
        this.agreementID = agreementID;
        this.customerID = customerID;
        this.carID = carID;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.pickupDateTime = pickupDateTime;
        this.dropOffDateTime = dropOffDateTime;
        this.insuranceCoverage = insuranceCoverage;
        this.additionalServices = additionalServices;
        this.termsAndConditions = termsAndConditions;
    }

    // Getters and setters
    public int getAgreementID() {
        return agreementID;
    }

    public void setAgreementID(int agreementID) {
        this.agreementID = agreementID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public Date getPickupDateTime() {
        return pickupDateTime;
    }

    public void setPickupDateTime(Date pickupDateTime) {
        this.pickupDateTime = pickupDateTime;
    }

    public Date getDropOffDateTime() {
        return dropOffDateTime;
    }

    public void setDropOffDateTime(Date dropOffDateTime) {
        this.dropOffDateTime = dropOffDateTime;
    }

    public boolean isInsuranceCoverage() {
        return insuranceCoverage;
    }

    public void setInsuranceCoverage(boolean insuranceCoverage) {
        this.insuranceCoverage = insuranceCoverage;
    }

    public String[] getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(String[] additionalServices) {
        this.additionalServices = additionalServices;
    }

    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(String termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }
}
