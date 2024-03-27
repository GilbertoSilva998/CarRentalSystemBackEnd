package za.ac.cput.factory;
import za.ac.cput.domain.Payment;
import za.ac.cput.util.Helper;
/*
 * PaymentFactory.java
 * Factory for Payment
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 21 March 2024
 */
public class PaymentFactory {

    public static Payment createPayment(String paymentID, String reservationID, String totalAmount, String paymentType, String date) {
        Helper.checkStringParam("paymentID", paymentID);
        Helper.checkStringParam("reservationID", reservationID);
        Helper.checkStringParam("totalAmount", totalAmount);
        Helper.checkStringParam("paymentType", paymentType);
        Helper.checkStringParam("date", date);
        return new Payment.Builder()
                .setPaymentID(paymentID)
                .setReservationID(reservationID)
                .setTotalAmount(totalAmount)
                .setPaymentType(paymentType)
                .setDate(date)
                .build();
    }
}