package za.ac.cput.factory;

/*
 * CustomerFactoryTest.Java
 * @author: Gilberto Silva (218239300)
 * Date: 20 March 2024
 * */

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.domain.Customer;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {
    private Customer customer1;
    private Customer customer2;
    private Customer customer3;

    @Test
    void test(){
        Customer customer = CustomerFactory.createCustomer
                ("Adam Smith",
                 "123456789",
                 "aSmith@gmail.com",
                 "Premium",
                 "Paid");

        System.out.println(customer.toString());
        assertNotNull(customer);
    }

    @Test
    void testEquality (){assertEquals(customer1, customer3);}

    @Test
    void testIdentity (){assertSame(customer1, customer3);}

    @Test
    void testFail(){assertEquals(customer1, customer2);}

    @Test
    @Timeout(value = 10000, unit = TimeUnit.MILLISECONDS)
    void testTimeout(){ System.out.println("Time has passed"); }

    @Test
    @Disabled("Disabled ERROR 808")
    void testWillBeSkipped(){}

}