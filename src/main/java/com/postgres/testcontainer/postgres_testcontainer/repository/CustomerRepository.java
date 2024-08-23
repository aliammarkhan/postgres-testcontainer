package com.postgres.testcontainer.postgres_testcontainer.repository;

import com.postgres.testcontainer.postgres_testcontainer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}