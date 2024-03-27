package za.ac.cput.factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Payment;

import static org.junit.jupiter.api.Assertions.*;
/*
 * Payment.java
 * TDD, Factory
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 25 March 2024.
 */
class PaymentFactoryTest {
    @Test
    public void createPayment() {
        Payment payment = PaymentFactory.createPayment("DO209", "AC989", "789.00", "Cash", "28-02-2024");
        System.out.println(payment.toString());
        assertNotNull(payment);
        assertEquals("DO209", payment.getPaymentID());
    }

}
