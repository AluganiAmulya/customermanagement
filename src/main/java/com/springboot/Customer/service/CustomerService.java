package com.springboot.Customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Customer.entity.Customer;
import com.springboot.Customer.repository.CustomerRepository;


	@Service
	public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	public List<Customer> listAll()
	{
		return repo.findAll();
		
	}
	public void saveOrupdate(Customer customers)
	{
		repo.save(customers);
	}
	public Customer getCustomerById(long id)
	{
		return repo.findById(id).get();
	}
	public Customer get(long id){
		return repo.findById(id).get();
	}
	public void delete(long id)
	{
		repo.deleteById(id);
	}
	}



