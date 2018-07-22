package com.edureka.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edureka.spring.inheritance.RegularEmployee;

public class DIClient {
	
	public static void main(String[] args) {
		
		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		 Person person = applicationContext.getBean("person", Person.class);
		 System.out.println(person.getAddress().getCity());
		 System.out.println(person.getAddress().getState());
		 ((AbstractApplicationContext)applicationContext).close();
	}
}
