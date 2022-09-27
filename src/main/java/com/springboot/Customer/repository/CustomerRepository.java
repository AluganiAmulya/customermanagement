package com.springboot.Customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Customer.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
