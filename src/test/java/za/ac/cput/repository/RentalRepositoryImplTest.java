package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.RentalAgreement;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/*
    Paul Maja 220214115
    24 March 2023
 */
class RentalRepositoryImplTest {

    private RentalRepository rentalRepository;

    @BeforeEach
    void setUp() {
        rentalRepository = new RentalRepositoryImpl();
    }

    @Test
    void addRental() {
        // Arrange
        RentalAgreement rental = createRental(1001, 2001, 3001, "Location A", "Location B", new Date(), new Date(), true, new String[]{"GPS"}, "Terms 1");

        // Act
        rentalRepository.addRental(rental);
        List<RentalAgreement> rentals = rentalRepository.getAllRentals();

        // Assert
        assertEquals(1, rentals.size());
        assertTrue(rentals.contains(rental));
    }

    @Test
    void getAllRentals() {
        RentalAgreement rental1 = createRental(1001, 2001, 3001, "Location A", "Location B", new Date(), new Date(), true, new String[]{"GPS"}, "Terms 1");
        RentalAgreement rental2 = createRental(1002, 2002, 3002, "Location C", "Location D", new Date(), new Date(), false, new String[]{"Child Seat"}, "Terms 2");

        rentalRepository.addRental(rental1);
        rentalRepository.addRental(rental2);
        List<RentalAgreement> rentals = rentalRepository.getAllRentals();

        // Assert
        assertEquals(2, rentals.size());
    }
    @Test
    void getRentalById() {
        // Arrange
        RentalAgreement rental = createRental(1001, 2001, 3001, "Location A", "Location B", new Date(), new Date(), true, new String[]{"GPS"}, "Terms 1");
        rentalRepository.addRental(rental);

        // Act
        RentalAgreement retrievedRental = rentalRepository.getRentalById(1001);

        // Assert
        assertNotNull(retrievedRental);
        assertEquals(rental.getAgreementID(), retrievedRental.getAgreementID());
    }

    @Test
    void updateRental() {
        // Arrange
        RentalAgreement rental = createRental(1001, 2001, 3001, "Location A", "Location B", new Date(), new Date(), true, new String[]{"GPS"}, "Terms 1");
        rentalRepository.addRental(rental);

       // rental.setPickupLocation("New Location");
        rentalRepository.updateRental(rental);
        RentalAgreement updatedRental = rentalRepository.getRentalById(1001);

        // Assert
        assertNotNull(updatedRental);
        assertEquals("CAPE Location", updatedRental.getPickupLocation());
    }

    @Test
    void deleteRental() {
        RentalAgreement rental = createRental(1001, 2001, 3001, "Location A", "Location B", new Date(), new Date(), true, new String[]{"GPS"}, "Terms 1");
        rentalRepository.addRental(rental);

        // Act
        rentalRepository.deleteRental(1001);
        RentalAgreement deletedRental = rentalRepository.getRentalById(1001);

        // Assert
        assertNull(deletedRental);
    }

    @Test
    void testGetAdditionalServices() {
        // Arrange
        String[] additionalServices = {"GPS", "Child Seat"};
        RentalAgreement rental = createRental(1001, 2001, 3001, "Location A", "Location B", new Date(), new Date(), true, additionalServices, "Terms 1");
        rentalRepository.addRental(rental);

        String[] retrievedAdditionalServices = rentalRepository.getRentalById(1001).getAdditionalServices();

        // Assert
        assertArrayEquals(additionalServices, retrievedAdditionalServices);
    }
    private RentalAgreement createRental(int agreementID, int customerID, int carID, String pickupLocation,
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
