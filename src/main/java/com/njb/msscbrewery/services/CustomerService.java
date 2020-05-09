package com.njb.msscbrewery.services;

import java.util.UUID;

import com.njb.msscbrewery.web.model.CustomerDto;

public interface CustomerService {

	CustomerDto getCustomerById(UUID customerId);

}
