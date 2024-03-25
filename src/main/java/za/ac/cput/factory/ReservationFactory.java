package za.ac.cput.factory;
import za.ac.cput.domain.Reservation;

import java.time.LocalDateTime;

public class ReservationFactory {

    public static Reservation createReservation(String reservationID, String customerID, String carModel,
                                                LocalDateTime pickupDateTime, LocalDateTime returnDateTime) {
        // Validate input parameters
        if (reservationID == null || reservationID.isEmpty()) {
            throw new IllegalArgumentException("Reservation ID cannot be null or empty");
        }
        if (customerID == null || customerID.isEmpty()) {
            throw new IllegalArgumentException("Customer ID cannot be null or empty");
        }
        if (carModel == null || carModel.isEmpty()) {
            throw new IllegalArgumentException("Car model cannot be null or empty");
        }
        if (pickupDateTime == null || returnDateTime == null || pickupDateTime.isAfter(returnDateTime)) {
            throw new IllegalArgumentException("Invalid pickup or return date/time");
        }

        // If all parameters are valid, create and return the Reservation object
        return new Reservation.Builder()
                .setReservationID(reservationID)
                .setCustomerID(customerID)
                .setCarModel(carModel)
                .setPickupDateTime(pickupDateTime)
                .setReturnDateTime(returnDateTime)
                .build();
    }
}

