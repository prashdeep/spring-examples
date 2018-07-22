package com.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edureka.spring.inheritance.RegularEmployee;

public class DIClient {
	
	public static void main(String[] args) {
		
		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		 RegularEmployee regularEmploye = applicationContext.getBean("regularEmployee", RegularEmployee.class);
		 
		 System.out.println(regularEmploye.getName());
		 System.out.println(applicationContext.getBean("p", Person.class).getCourses());
		 ((AbstractApplicationContext)applicationContext).close();
	}
}
