package com.njb.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.njb.msscbrewery.web.model.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		return CustomerDto.builder().id(UUID.randomUUID()).name("Joe Buck").build();
	}

	@Override
	public CustomerDto saveNewCustomer(CustomerDto customerDto) {
		return CustomerDto.builder().id(UUID.randomUUID()).build();
	}

	@Override
	public void updateCustomer(UUID customerId, CustomerDto customerDto) {
		// todo impl
		log.debug("Updating....");
	}

	@Override
	public void deleteById(UUID customerId) {
		log.debug("Deleting.... ");
	}

}
