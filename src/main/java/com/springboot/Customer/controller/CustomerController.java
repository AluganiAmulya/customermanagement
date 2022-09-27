package com.springboot.Customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Customer.entity.Customer;
import com.springboot.Customer.service.CustomerService;


public class CustomerController {
	@RestController
	public class EmployeeController {
		@Autowired
		private CustomerService services;
			
			@GetMapping("/")
			public Iterable<Customer>getCustomers()
			{
				return services.listAll();
			}
			
			@PostMapping(value = "/save")
			private long saveCustomer(@RequestBody Customer customers)
			{
				services.saveOrupdate(customers);
				return customers.getId();
			}
			@RequestMapping("/customer/{id}")
			private Customer getCustomer(@PathVariable(name="id") int customerid)
			{
				return services.getCustomerById(customerid);
			}
			@PutMapping("//edit{id}")
			private Customer update(@RequestBody Customer customers,@PathVariable int id)
			{
				customers.setId(id);
				services.saveOrupdate(customers);
				return customers;
				
			}
			@DeleteMapping("/delete/{id}")
			private void deleteCustomer(@PathVariable("id")int id)
		{
			services.delete(id);
		}
		}


}
