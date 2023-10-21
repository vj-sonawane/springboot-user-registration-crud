package com.dps.usercrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@SpringBootApplication
public class UserRegistrationCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationCrudApplication.class, args);
	}

}
