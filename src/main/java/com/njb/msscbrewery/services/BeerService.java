package com.njb.msscbrewery.services;

import java.util.UUID;

import com.njb.msscbrewery.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerId);

	BeerDto savedDto(BeerDto beerDto);

	BeerDto updateBeer(UUID beerId, BeerDto beerDto);

	void deleteById(UUID beerId);

}
