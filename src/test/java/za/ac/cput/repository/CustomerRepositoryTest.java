package za.ac.cput.repository;

/*
 * CustomerRepositoryTest.Java
 * @author: Gilberto Silva (218239300)
 * Date: 21 March 2024
 * */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerRepositoryTest {

    private static final CustomerRepository customerRepository = CustomerRepository.getCustomerRepository();

    private static final Customer customer = CustomerFactory.createCustomer
            ("John Smith",
             "098765432",
             "jSmith@gmail.com",
             "Available ",
             "Paid");

    @Test
    void a_create() {
        Customer created = customerRepository.create(customer);
        assert customer != null;
        assertEquals(customer.getCustomerID(), created.getCustomerID());
        System.out.println("Create " +created);
    }

    @Test
    void b_read() {
        assert customer != null;
        Customer read = customerRepository.read(customer.getCustomerID());
        assertNotNull(read);
        System.out.println("Read " + read);
    }

    @Test
    void c_update() {
        assert customer != null;
        Customer updated = new Customer.Builder().copy(customer)
                .setName("Adam")
                .setPhoneNumber("1234567890")
                .setEmail("aSmith@gmail.com")
                .setMembershipStatus("Not Available")
                .setPaymentInformation("Not Paid")
                .build();
        assertNotNull(customerRepository.update(updated));
        System.out.println("Updated " + updated);
    }

    @Test
    void e_delete() {
        assert customer != null;
        boolean deleted = customerRepository.delete(customer.getCustomerID());
        assertTrue(deleted);
        System.out.println("Deleted " + true);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(customerRepository.getAll());
    }
}