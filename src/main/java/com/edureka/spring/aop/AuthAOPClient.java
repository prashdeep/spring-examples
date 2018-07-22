package com.edureka.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AuthAOPClient {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		SavingsAccount savingsAccount = (SavingsAccount) appContext.getBean("proxy");
		System.out.println(savingsAccount.withdraw(10000));
		((AbstractApplicationContext) appContext).registerShutdownHook();
	}

}
