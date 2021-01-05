package com.example.demo.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Scope("prototype")
//@Scope("singleton")

public class Company {
	private Employee employee;
	@Autowired
//	public Company(@Qualifier("emp2") Employee employee) {
public Company() {
		System.out.println("Hello feom company constructor");
//	this.employee = employee;
		
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Hello from init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Hello from destroy method");
	}

}
