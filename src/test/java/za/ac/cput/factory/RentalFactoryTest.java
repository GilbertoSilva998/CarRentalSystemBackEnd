package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.RentalAgreement;

import java.util.Arrays;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
/*
    Paul Maja 220214115
    24 March 2023
 */
class RentalFactoryTest {

    @Test
    void createRental() {
        // Arrange
        int agreementID = 1001;
        int customerID = 2001;
        int carID = 3001;
        String pickupLocation = "BMW Car Rentals";
        String dropOffLocation = "TOWN Location";
        Date pickupDateTime = new Date();
        Date dropOffDateTime = new Date();
        boolean insuranceCoverage = true;
        String[] additionalServices = {"GPS", "Child Seat"}; // Array of additional services
        String termsAndConditions = "Standard Terms Apply";

        RentalAgreement rental = RentalFactory.createRental(agreementID, customerID, carID, pickupLocation,
                dropOffLocation, pickupDateTime, dropOffDateTime, insuranceCoverage, new String[]{Arrays.toString(additionalServices)}, termsAndConditions);

        // Assert
        assertNotNull(rental);
        assertEquals(agreementID, rental.getAgreementID());
        assertEquals(customerID, rental.getCustomerID());
        assertEquals(carID, rental.getCarID());
        assertEquals(pickupLocation, rental.getPickupLocation());
        assertEquals(dropOffLocation, rental.getDropOffLocation());
        assertEquals(pickupDateTime, rental.getPickupDateTime());
        assertEquals(dropOffDateTime, rental.getDropOffDateTime());
        assertEquals(insuranceCoverage, rental.isInsuranceCoverage());
        assertEquals(Arrays.asList(additionalServices), Arrays.asList(rental.getAdditionalServices()));
        assertEquals(termsAndConditions, rental.getTermsAndConditions());
    }
}
