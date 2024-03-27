package za.ac.cput.repository;
import za.ac.cput.domain.Payment;
import java.util.Set;

/*
 * Payment.java
 * Interface
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 23 March 2024.
 */

public interface IPaymentRepository extends IRepository<Payment, String>{
    public Set<Payment> getAll();
}
