package com.customer.microservice.service;

import com.customer.microservice.dto.CustomerDto;

public interface CustomerService {

	void createCustomer(CustomerDto customerDto);
}
