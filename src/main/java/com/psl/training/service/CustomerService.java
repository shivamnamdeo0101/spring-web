package com.psl.training.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.psl.training.model.Customer;

@Service
public class CustomerService {
	
	public Customer insertCustomer(Customer customer) {
		return customer;
	}
}
