package za.ac.cput.repository;

import za.ac.cput.domain.RentalAgreement;

import java.util.ArrayList;
import java.util.List;
/*
    Paul Maja 220214115
    25 March 2024
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
    public RentalAgreement getRentalById(String agreementID) {
        return rentals.stream().filter(rental -> rental.getAgreementID().equals(agreementID)).findFirst().orElse(null);
    }

    @Override
    public void addRental(RentalAgreement rental) {
        rentals.add(rental);
    }

    @Override
    public void updateRental(RentalAgreement updatedRental) {
        for (int i = 0; i < rentals.size(); i++) {
            RentalAgreement rental = rentals.get(i);
            if (rental.getAgreementID().equals(updatedRental.getAgreementID())) {
                rentals.set(i, updatedRental);
                return;
            }
        }
    }

    @Override
    public void deleteRental(String agreementID) {
        rentals.removeIf(rental -> rental.getAgreementID().equals(agreementID));
    }
}


