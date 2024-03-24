package za.ac.cput.repository;

import za.ac.cput.domain.RentalAgreement;

import java.util.List;
/*
    Paul Maja 220214115
    24 March 2023
 */
public interface RentalRepository {
    List<RentalAgreement> getAllRentals();

    RentalAgreement getRentalById(int agreementID);

    void addRental(RentalAgreement rental);

    void updateRental(RentalAgreement updatedRental);

    void deleteRental(int agreementID);
}

