package za.ac.cput.repository;

import za.ac.cput.domain.RentalAgreement;

import java.util.List;

public interface RentalRepository {
    List<RentalAgreement> getAllRentals();

    RentalAgreement getRentalById(int agreementID);

    void addRental(RentalAgreement rental);

    void updateRental(RentalAgreement updatedRental);

    void deleteRental(int agreementID);
}

