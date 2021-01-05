package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

import com.example.demo.model.Company;
import com.example.demo.model.Employee;
@Import(DBConfig.class)
@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class Config {
	@Bean
	@Lazy(value = false)
	public Employee getEmployeeObject() {
		System.out.println("hello from get");
		return new Employee();
	}
	//@Bean(name = "company",initMethod="init",destroyMethod="destroy")
	@Bean(name = "company")
	public Company getCompanyObject() {
		return new Company();
	}
}
