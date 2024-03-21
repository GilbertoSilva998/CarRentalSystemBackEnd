package za.ac.cput.factory;

import za.ac.cput.domain.Payment;

public class PaymentFactory {

    public static Payment createPayment(String paymentID, String reservationID, double totalAmount, String paymentType, String date){
        Payment payment = new Payment.Builder()
                .setPaymentID(paymentID)
                .setReservationID(reservationID)
                .setTotalAmount(totalAmount)
                .setPaymentType(paymentType)
                .setDate(date)
                .build();
            return payment;
    }
}
