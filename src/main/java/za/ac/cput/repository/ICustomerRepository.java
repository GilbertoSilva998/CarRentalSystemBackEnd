package za.ac.cput.repository;

/*
 * ICustomerRepository.Java
 * @author: Gilberto Silva (218239300)
 * Date: 21 March 2024
 * */

import za.ac.cput.domain.Customer;
import java.util.List;

public interface ICustomerRepository  extends IRepository<Customer, String> {
    public List<Customer> getAll();
}
