package za.ac.cput.repository;
import org.junit.jupiter.api.*;
import za.ac.cput.domain.Payment;
import za.ac.cput.factory.PaymentFactory;
import static org.junit.jupiter.api.Assertions.*;
/*
 * Payment.java
 * TDD, Payment
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 26 March 2024.
 */

@TestMethodOrder(MethodOrderer.MethodName.class)
class PaymentRepositoryTest {
    private static PaymentRepository paymentRepo = PaymentRepository.getPaymentRepo();
    private static Payment payment = PaymentFactory.createPayment("AC902", "RD121", "1024.00", "Cash", "26 March 2024");

    @Test
    void a_create() {
        Payment created = paymentRepo.create(payment);
        assertEquals(payment.getPaymentID(), created.getPaymentID());
        System.out.println("Create:" + created);
    }

    @Test
    void b_read() {
        Payment read = paymentRepo.read(payment.getPaymentID());
        assertNotNull(read);
        System.out.println("Read:" + read);
    }

    @Test
    void c_update() {
        Payment updated = new Payment.Builder().copy(payment)
                .setReservationID("AC565")
                .setTotalAmount("450")
                .setPaymentType("Online")
                .build();
        assertNotNull(paymentRepo.update(updated));
        System.out.println("Updated:" + updated);
    }

    @Test
    @Order(5)
    void e_delete() {
        boolean delete = paymentRepo.delete(payment.getPaymentID());
        assertTrue(delete);
        System.out.println("Deleted:" + true);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all:");
        System.out.println(paymentRepo.getAll());
        assertNotNull(paymentRepo.getAll());
    }
}