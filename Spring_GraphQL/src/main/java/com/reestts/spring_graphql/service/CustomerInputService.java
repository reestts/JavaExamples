package com.reestts.spring_graphql.service;

import com.reestts.spring_graphql.entity.Customer;

public class CustomerInputService {

    public String firstName;
    public String lastName;
    public String email;
    public String phoneNumber;
    public String address;
    public String city;
    public String state;
    public String zipCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(final String zipCode) {
        this.zipCode = zipCode;
    }

    public Customer getCustomerEntity() {
        Customer customer = new Customer();
        customer.setFirstName(this.getFirstName());
        customer.setLastName(this.getLastName());
        customer.setEmail(this.getEmail());
        customer.setPhoneNumber(this.getPhoneNumber());
        customer.setAddress(this.getAddress());
        customer.setCity(this.getCity());
        customer.setState(this.getState());
        customer.setZipcode(this.getZipCode());

        return customer;
    }
}
