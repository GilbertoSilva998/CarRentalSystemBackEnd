package za.ac.cput.repository;
import za.ac.cput.domain.Payment;
import java.util.HashSet;
import java.util.Set;

/*
 * Payment.java
 * Repository
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 23 March 2024.
 */
public class PaymentRepository implements IPaymentRepository{
    private static PaymentRepository paymentRepo = null;
    private Set <Payment> paymentDB;

    private PaymentRepository(){
        paymentDB = new HashSet<Payment>();
    }

    //Test, repository if it does exist or not.
    public static PaymentRepository getPaymentRepo(){
        if(paymentRepo == null){
            paymentRepo = new PaymentRepository();
        }
        return paymentRepo;
    }
    //Create, Read, Update, and Delete functions.
    @Override
    public Payment create(Payment payment){
        boolean success = paymentDB.add(payment);
        if(!success){
            return null;
        }
        return payment;
    }
    @Override
    public Payment read(String paymentID){
        for(Payment readPayment: paymentDB){
            if(readPayment.getPaymentID().equals(paymentID)){
                return readPayment;
            }
        }
        return null;
    }
    @Override
    public Payment update(Payment payment){
        Payment oldPayment = read(payment.getPaymentID());
        if(oldPayment != null){
            paymentDB.remove(oldPayment);
            paymentDB.add(payment);
            return payment;
        }
        return null;
    }
    @Override
    public boolean delete(String paymentID){
        Payment deletePayment = read(paymentID);
        if(deletePayment == null){
            return false;
        }
        paymentDB.remove(deletePayment);
        return true;
    }
    @Override
    public Set<Payment> getAll() {
        return paymentDB;
    }
}
