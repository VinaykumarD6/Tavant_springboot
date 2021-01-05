package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

import com.example.demo.model.Employee;

@Configuration
public class DBConfig {
	@Bean("emp2")
	@Lazy(false )
	public Employee getEmployeeObject2() {
		System.out.println("Hello from emp2");
		return new Employee();
	}

}
