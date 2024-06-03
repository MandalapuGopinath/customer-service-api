package com.customer.microservice.service.impl;

import org.springframework.stereotype.Service;

import com.customer.microservice.dto.CustomerDto;
import com.customer.microservice.entity.Customer;
import com.customer.microservice.mapper.CustomerMapper;
import com.customer.microservice.repository.CustomerRepository;
import com.customer.microservice.service.CustomerService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService{

	private CustomerRepository customerRepository;
	private CustomerMapper customerMapper;

	public void createCustomer(CustomerDto customerDto) {
		Customer customer = customerMapper.mapToCustomer(customerDto,new Customer());
		customerRepository.save(customer);
	}

}
