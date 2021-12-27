	
package com.bridgelabz.employeepayrollapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EmployeePayrollAppDay5Application {

	public static void main(String[] args) {
		SpringApplication.run(EmployeePayrollAppDay5Application.class, args);
		log.info("EmployeePayRoll App  started");
	}

}
