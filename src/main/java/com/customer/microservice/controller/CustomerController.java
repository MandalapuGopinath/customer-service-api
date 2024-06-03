package com.customer.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.microservice.constants.CustomerConstants;
import com.customer.microservice.dto.CustomerDto;
import com.customer.microservice.dto.ResponseDto;
import com.customer.microservice.service.CustomerService;

@RestController
@RequestMapping(name = "/api")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDto> createCustomer(@RequestBody CustomerDto customerDto){
		customerService.createCustomer(customerDto);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(new ResponseDto(CustomerConstants.STATUS_201,CustomerConstants.MESSAGE_201));
	}
}
