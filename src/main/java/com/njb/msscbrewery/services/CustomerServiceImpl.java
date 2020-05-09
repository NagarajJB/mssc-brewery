package com.njb.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.njb.msscbrewery.web.model.CustomerDto;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID customerId) {

		return CustomerDto.builder().id(customerId).name("Nag").build();
	}

}
