package za.ac.cput.domain;

/*
 * Customer.Java
 * @author: Gilberto Silva (218239300)
 * Date: 19 March 2024
 * */

import java.util.Objects;

public class Customer {
    private String customerID;
    private String name;
    private String phoneNumber;
    private String email;
    private String membershipStatus;
    private String paymentInformation;

    //----------------- Constructor -------------------
    public Customer() {}

    public Customer(Builder builder) {
        this.customerID = builder.customerID;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
        this.membershipStatus = builder.membershipStatus;
        this.paymentInformation = builder.paymentInformation;
    }

    //----------------- Getters -------------------------
    public String getCustomerID() { return customerID; }
    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
    public String getMembershipStatus() { return membershipStatus; }
    public String getPaymentInformation() { return paymentInformation; }

    //----------------- Has Code -------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerID, customer.customerID)
                && Objects.equals(name, customer.name)
                && Objects.equals(phoneNumber, customer.phoneNumber)
                && Objects.equals(email, customer.email)
                && Objects.equals(membershipStatus, customer.membershipStatus)
                && Objects.equals(paymentInformation, customer.paymentInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerID, name, phoneNumber, email, membershipStatus, paymentInformation);
    }

    //----------------- To String -------------------
    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", membershipStatus='" + membershipStatus + '\'' +
                ", paymentInformation='" + paymentInformation + '\'' +
                '}';
    }

    //----------------- Builder -------------------
    public static class Builder{
        private String customerID;
        private String name;
        private String phoneNumber;
        private String email;
        private String membershipStatus;
        private String paymentInformation;

        public Builder setCustomerID(String customerID) {
            this.customerID = customerID;
            return this;

        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setMembershipStatus(String membershipStatus) {
            this.membershipStatus = membershipStatus;
            return this;
        }

        public Builder setPaymentInformation(String paymentInformation) {
            this.paymentInformation = paymentInformation;
            return this;
        }

        public Builder copy(Customer customer) {
            this.customerID = customer.customerID;
            this.name = customer.name;
            this.phoneNumber = customer.phoneNumber;
            this.email = customer.email;
            this.membershipStatus = customer.membershipStatus;
            this.paymentInformation = customer.paymentInformation;
            return this;
        }
        public Customer build(){ return new Customer (this);}
    }
}
