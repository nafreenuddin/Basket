package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Customer;

public interface ICustomer {
	public Customer addCustomer(Customer c);
	public Customer updateCustomer(Customer customer) throws Exception;
	public Customer removeCustomer(int customerId) throws Exception;
	public List<Customer> showAllCustomers();
	public Optional<Customer> viewCustomer(int customerdId);
	
}
