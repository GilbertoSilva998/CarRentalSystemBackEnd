package za.ac.cput.factory;

import za.ac.cput.domain.RentalAgreement;

import java.util.Date;

public class RentalFactory {
   public static RentalAgreement createRental(int agreementID, int customerID, int carID, String pickupLocation,
                                              String dropOffLocation, Date pickupDateTime, Date dropOffDateTime,
                                              boolean insuranceCoverage, String [] additionalServices, String termsAndConditions) {
      RentalAgreement rental = new RentalAgreement(agreementID, customerID, carID, pickupLocation, dropOffLocation, pickupDateTime, dropOffDateTime, insuranceCoverage, additionalServices, termsAndConditions);
      rental.setAgreementID(agreementID);
      rental.setCustomerID(customerID);
      rental.setCarID(carID);
      rental.setPickupLocation(pickupLocation);
      rental.setDropOffLocation(dropOffLocation);
      rental.setPickupDateTime(pickupDateTime);
      rental.setDropOffDateTime(dropOffDateTime);
      rental.setInsuranceCoverage(insuranceCoverage);
      rental.setAdditionalServices(additionalServices);
      rental.setTermsAndConditions(termsAndConditions);
      return rental;
   }
}

