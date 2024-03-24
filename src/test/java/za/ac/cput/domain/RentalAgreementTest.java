package za.ac.cput.domain;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RentalTest {

    @Test
    void testRentalObjectCreation() {
        RentalAgreement rental = new RentalAgreement(1, 101, 201, "Location George", "Location Worcester",
                new Date(), new Date(), true, new String[]{"GPS"}, "Some terms and conditions");

        assertNotNull(rental);
    }

    @Test
    void testGettersAndSetters() {
        // Arrange
        int agreementID = 1;
        int customerID = 101;
        int carID = 201;
        String pickupLocation = "Cape Town Location";
        String dropOffLocation = "George Location";
        Date pickupDateTime = new Date();
        Date dropOffDateTime = new Date();
        boolean insuranceCoverage = true;
        String[] additionalServices = {"GPS", "Child seat"};
        String termsAndConditions = "Some terms and conditions";

        // Act
        RentalAgreement rental = new RentalAgreement(agreementID, customerID, carID, pickupLocation,
                dropOffLocation, pickupDateTime, dropOffDateTime, insuranceCoverage, additionalServices, termsAndConditions);

        // Assert
        assertEquals(agreementID, rental.getAgreementID());
        assertEquals(customerID, rental.getCustomerID());
        assertEquals(carID, rental.getCarID());
        assertEquals(pickupLocation, rental.getPickupLocation());
        assertEquals(dropOffLocation, rental.getDropOffLocation());
        assertEquals(pickupDateTime, rental.getPickupDateTime());
        assertEquals(dropOffDateTime, rental.getDropOffDateTime());
        assertEquals(insuranceCoverage, rental.isInsuranceCoverage());
        assertArrayEquals(additionalServices, rental.getAdditionalServices());
        assertEquals(termsAndConditions, rental.getTermsAndConditions());
    }
}
