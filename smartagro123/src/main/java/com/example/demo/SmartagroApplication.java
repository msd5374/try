package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication(scanBasePackages = {"com.example.demo","com.smartagro.registration","com.smartagro.login"})
@EntityScan({"com.smartagro.registration"})
//@SpringBootApplication
public class SmartagroApplication {

	public static void main(String[] args) {
		System.out.println("server starting");
		
		
		SpringApplication.run(SmartagroApplication.class, args);
		
		
	}
	
	

}
