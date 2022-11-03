package com.reestts.spring_graphql.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findAll();

    Customer findCustomerById(Long id);

    Customer findCustomerByEmail(String email);

}
