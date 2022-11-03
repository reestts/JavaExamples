package com.reestts.spring_graphql.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @Id
    @Column(name = "CUSTOMER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phoneNumber;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "ZIPCODE")
    private String zipcode;

    private Long getId() {
        return id;
    }

    private void setId(final Long id) {
        this.id = id;
    }

    private String getFirstName() {
        return firstName;
    }

    private void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(final String email) {
        this.email = email;
    }

    private String getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String getAddress() {
        return address;
    }

    private void setAddress(final String address) {
        this.address = address;
    }

    private String getCity() {
        return city;
    }

    private void setCity(final String city) {
        this.city = city;
    }

    private String getState() {
        return state;
    }

    private void setState(final String state) {
        this.state = state;
    }

    private String getZipcode() {
        return zipcode;
    }

    private void setZipcode(final String zipcode) {
        this.zipcode = zipcode;
    }
}
