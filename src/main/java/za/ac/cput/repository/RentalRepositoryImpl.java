package za.ac.cput.repository;

import za.ac.cput.domain.RentalAgreement;

import java.util.ArrayList;
import java.util.List;
/*
    Paul Maja 220214115
    24 March 2023
 */
public class RentalRepositoryImpl implements RentalRepository {
    private final List<RentalAgreement> rentals;

    public RentalRepositoryImpl() {
        this.rentals = new ArrayList<>();
    }

    @Override
    public List<RentalAgreement> getAllRentals() {
        return rentals;
    }

    @Override
    public RentalAgreement getRentalById(int agreementID) {
        for (RentalAgreement rental : rentals) {
            if (rental.getAgreementID() == agreementID) {
                return rental;
            }
        }
        return null;
    }

    @Override
    public void addRental(RentalAgreement rental) {
        rentals.add(rental);
    }

    @Override
    public void updateRental(RentalAgreement updatedRental) {
        for (int i = 0; i < rentals.size(); i++) {
            RentalAgreement rental = rentals.get(i);
            if (rental.getAgreementID() == updatedRental.getAgreementID()) {
                rentals.set(i, updatedRental);
                return;
            }
        }
    }

    @Override
    public void deleteRental(int agreementID) {
        rentals.removeIf(rental -> rental.getAgreementID() == agreementID);
    }
}

