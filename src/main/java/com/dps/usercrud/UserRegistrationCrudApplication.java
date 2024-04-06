package com.dps.usercrud;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@SpringBootApplication
@EnableEncryptableProperties
public class UserRegistrationCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationCrudApplication.class, args);
	}

}
