package za.ac.cput.factory;

/*
 * CustomerFactory.Java
 * @author: Gilberto Silva (218239300)
 * Date: 20 March 2024
 * */

import za.ac.cput.domain.Customer;
import za.ac.cput.util.Helper;

public class CustomerFactory {
    public static Customer createCustomer(String name,
                                          String phoneNumber,
                                          String email,
                                          String membershipStatus,
                                          String paymentInformation){

        if (Helper.isNullorEmpty(name) || Helper.isNullorEmpty(email)) {
            return null;
        }

        String customerID = Helper.generateId();

        Customer customer = new Customer.Builder().setCustomerID(customerID)
                .setName(name)
                .setPhoneNumber(phoneNumber)
                .setEmail(email)
                .setMembershipStatus(membershipStatus)
                .setPaymentInformation(paymentInformation)
                .build();
        return customer;
    }
}
