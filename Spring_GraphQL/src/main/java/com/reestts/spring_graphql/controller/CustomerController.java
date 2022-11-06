package com.reestts.spring_graphql.controller;

import com.reestts.spring_graphql.entity.Customer;
import com.reestts.spring_graphql.service.CustomerInputService;
import com.reestts.spring_graphql.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerRepository customerRepository;

    @QueryMapping
    public Iterable<Customer> customers() {
        return this.customerRepository.findAll();
    }

    @QueryMapping
    public Customer customerById(@Argument Long id) {
        return this.customerRepository.findCustomerById(id);
    }

    @QueryMapping
    public Customer customerByEmail(@Argument String email) {
        return this.customerRepository.findCustomerByEmail(email);
    }

    @MutationMapping
    public Customer addCustomer(@Argument(name = "input") CustomerInputService customerInputService) {
        return this.customerRepository.save(customerInputService.getCustomerEntity());
    }
}
