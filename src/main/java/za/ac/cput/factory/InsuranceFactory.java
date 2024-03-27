package za.ac.cput.factory;
import za.ac.cput.domain.Insurance;
import za.ac.cput.util.Helper;
/*
 * InsuranceFactory.java
 * Factory for Insurance
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 21 March 2024
 */
public class InsuranceFactory {

    public static Insurance createInsurance(String insuranceID, String coverageType, String coverageAmount){
        Helper.checkStringParam("InsuranceID", insuranceID);
        Helper.checkStringParam("coverageType", coverageType);
        Helper.checkStringParam("coverageAmount", coverageAmount);
        return new Insurance.Builder()
                .setInsuranceID(insuranceID)
                .setCoverageAmount(coverageAmount)
                .setCoverageType(coverageType)
                .build();
    }
}

