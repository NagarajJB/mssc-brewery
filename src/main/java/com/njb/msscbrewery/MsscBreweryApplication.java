package com.njb.msscbrewery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.njb.msscbrewery.*")
public class MsscBreweryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscBreweryApplication.class, args);
	}

}
