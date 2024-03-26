package za.ac.cput.repository;

/*
 *@author: Philani shange 222790210
 * date: 23 March 2024
 */

import za.ac.cput.domain.Reservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReservationRepository {
    private List<Reservation> reservations;

    public ReservationRepository() {
        this.reservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void removeReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

    public List<Reservation> getAllReservations() {
        return reservations;
    }

    public Optional<Reservation> findReservationByID(String reservationID) {
        return reservations.stream()
                .filter(reservation -> reservation.getReservationID().equals(reservationID))
                .findFirst();
    }

    public void updateReservation(String reservationID, Reservation updatedReservation) {
        for (int i = 0; i < reservations.size(); i++) {
            if (reservations.get(i).getReservationID().equals(reservationID)) {
                reservations.set(i, updatedReservation);
                return;
            }
        }
        throw new IllegalArgumentException("Reservation not found: " + reservationID);
    }
}

