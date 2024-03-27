package za.ac.cput.factory;

import za.ac.cput.domain.RentalAgreement;
/*
    Paul Maja 220214115
    25 March 2023
 */
public class RentalFactory {
   public static RentalAgreement createRental(String agreementID, String customerID, String carID, String pickupLocation,
                                              String dropOffLocation, String pickupDateTime, String dropOffDateTime,
                                              boolean insuranceCoverage, String[] additionalServices, String termsAndConditions) {
      return new RentalAgreement.Builder()
              .setAgreementID(agreementID)
              .setCustomerID(customerID)
              .setCarID(carID)
              .setPickupLocation(pickupLocation)
              .setDropOffLocation(dropOffLocation)
              .setPickupDateTime(pickupDateTime)
              .setDropOffDateTime(dropOffDateTime)
              .setInsuranceCoverage(insuranceCoverage)
              .setAdditionalServices(additionalServices)
              .setTermsAndConditions(termsAndConditions)
              .build();
   }
}


