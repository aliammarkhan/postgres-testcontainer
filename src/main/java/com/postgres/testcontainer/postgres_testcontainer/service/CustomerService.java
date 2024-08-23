package com.postgres.testcontainer.postgres_testcontainer.service;

import com.postgres.testcontainer.postgres_testcontainer.model.Customer;
import com.postgres.testcontainer.postgres_testcontainer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
