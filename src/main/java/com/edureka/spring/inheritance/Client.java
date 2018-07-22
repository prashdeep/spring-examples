package com.edureka.spring.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ContractEmployee contractEmployee = context.getBean("contractEmploye", ContractEmployee.class);
		System.out.println(contractEmployee.getDuration());
	}

}
