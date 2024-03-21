package za.ac.cput.repository;

/*
 * CustomerRepository.Java
 * @author: Gilberto Silva (218239300)
 * Date: 21 March 2024
 * */

import za.ac.cput.domain.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{

    private static CustomerRepository customerRepo = null;

    private List <Customer> customerList = new ArrayList<>();

    private CustomerRepository () {customerList = new ArrayList<Customer>();}

    public static CustomerRepository getCustomerRepository(){
        if (customerRepo == null) {
            customerRepo = new CustomerRepository();
        }
        return customerRepo;
    }

    @Override
    public Customer create(Customer customer) {
        boolean success = customerList.add(customer);
        if (!success) {
            return null;
        }
        return customer;
    }

    @Override
    public Customer read(String customerID) {
        Customer customer = customerList.stream()
                .filter(s -> s.getCustomerID().equals(customerID))
                .findAny()
                .orElse(null);

        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        Customer oldCustomer = read(customer.getCustomerID());
        if (oldCustomer != null) {
            customerList.remove(oldCustomer);
            customerList.add(customer);
            return customer;
        }
        return null;
    }

    @Override
    public boolean delete(String customerID) {
        Customer deleteCustomer = read(customerID);
        if (deleteCustomer == null) {
            customerList.remove(deleteCustomer);
            return false;
        }
        return true;
    }

    @Override
    public List<Customer> getAll() {
        return customerList;
    }
}
