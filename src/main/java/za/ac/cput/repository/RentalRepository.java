package za.ac.cput.repository;

import za.ac.cput.domain.RentalAgreement;

import java.util.List;
/*
    Paul Maja 220214115
    25 March 2024
 */
public interface RentalRepository {
    List<RentalAgreement> getAllRentals();

    RentalAgreement getRentalById(String agreementID);

    void addRental(RentalAgreement rental);

    void updateRental(RentalAgreement updatedRental);

    void deleteRental(String agreementID);
}

