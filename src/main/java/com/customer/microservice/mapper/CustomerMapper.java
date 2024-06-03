package com.customer.microservice.mapper;

import com.customer.microservice.dto.CustomerDto;
import com.customer.microservice.entity.Customer;

public class CustomerMapper {

	public CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
		customerDto.setName(customer.getName());
		customerDto.setEmail(customer.getEmail());
		customerDto.setMobileNumber(customer.getMobileNumber());
		return customerDto;
	}

	public Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
		customer.setName(customerDto.getName());
		customer.setMobileNumber(customerDto.getMobileNumber());
		customer.setEmail(customerDto.getEmail());
		return customer;
	}
}
