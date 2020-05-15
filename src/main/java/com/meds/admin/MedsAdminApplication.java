package com.meds.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.meds"})
@EntityScan({"com.meds.model"})
public class MedsAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedsAdminApplication.class, args);
	}

}
