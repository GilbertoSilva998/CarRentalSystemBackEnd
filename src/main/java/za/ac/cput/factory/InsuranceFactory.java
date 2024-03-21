package za.ac.cput.factory;

import za.ac.cput.domain.Insurance;

public class InsuranceFactory {

    public static Insurance createInsurance(String insuranceID, String coverageType, double coverageAmount){
        Insurance insurance = new Insurance.Builder()
                .setInsuranceID(insuranceID)
                .setCoverageType(coverageType)
                .setCoverageAmount(coverageAmount)
                .build();
        return insurance;
    }
}
