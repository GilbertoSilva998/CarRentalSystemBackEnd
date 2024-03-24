package za.ac.cput.factory;

import za.ac.cput.domain.RentalAgreement;

import java.util.Date;
/*
    Paul Maja 220214115
    24 March 2023
 */
public class RentalFactory {
   public static RentalAgreement createRental(int agreementID, int customerID, int carID, String pickupLocation,
                                              String dropOffLocation, Date pickupDateTime, Date dropOffDateTime,
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


