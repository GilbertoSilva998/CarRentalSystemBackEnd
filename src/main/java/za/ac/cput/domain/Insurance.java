package za.ac.cput.domain;

/*
 * Insurance.java
 * Entity for the Insurance
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 21 March 2024
 */

public class Insurance {
    private String insuranceID;
    private String coverageType;
    private double coverageAmount;

    private Insurance(Builder builder){
        this.insuranceID = builder.insuranceID;
        this.coverageType = builder.coverageType;
        this.coverageAmount = builder.coverageAmount;
    }
    //Getters
    public String getInsuranceID() {
        return insuranceID;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "insuranceID='" + insuranceID + '\'' +
                ", coverageType='" + coverageType + '\'' +
                ", coverageAmount='" + coverageAmount + '\'' +
                '}';
    }

    public static class Builder{
        private String insuranceID;
        private String coverageType;
        private double coverageAmount;

        public Builder setInsuranceID(String insuranceID) {
            this.insuranceID = insuranceID;
            return this;
        }

        public Builder setCoverageType(String coverageType) {
            this.coverageType = coverageType;
            return this;
        }

        public Builder setCoverageAmount(double coverageAmount) {
            this.coverageAmount = coverageAmount;
            return this;
        }

        public Builder copy(Insurance insurance){
            this.insuranceID = insurance.insuranceID;
            this.coverageType = insurance.coverageType;
            this.coverageAmount = insurance.coverageAmount;
            return this;
        }

        public Insurance build(){
            return new Insurance(this);
        }
    }
}
