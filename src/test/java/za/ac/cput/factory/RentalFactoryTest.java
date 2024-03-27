package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.RentalAgreement;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
/*
    Paul Maja 220214115
    25 March 2024
 */
class RentalFactoryTest {

    @Test
    void createRental() {
        // Arrange
        String agreementID = "1001";
        String customerID = "2001";
        String carID = "3001";
        String pickupLocation = "BMW Car Rentals";
        String dropOffLocation = "TOWN Location";
        String pickupDateTime = "08:30am - 4:00pm";
        String dropOffDateTime = "08:30am - 4:00pm";
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
