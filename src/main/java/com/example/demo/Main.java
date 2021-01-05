package com.example.demo;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.config.Config;
import com.example.demo.model.Company;
import com.example.demo.model.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		//Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		//Employee employee = context.getBean("emp2",Employee.class);
		//System.out.println(employee);
		//Company c1 = context.getBean(Company.class);
		//System.out.println(c1.hashCode());
		//Company c2 = context.getBean(Company.class);
		//System.out.println(c2.hashCode());
		//System.out.println(c1.equals(c2));
		context.close();
	}

}
