package com.edureka.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class AuthAspect implements MethodBeforeAdvice{

	public void before(Method method, Object[] arguments, Object target) throws Throwable {
		System.out.println("Performing authentication");
		if ( !method.getName().equalsIgnoreCase("getBalance")) {
			
			System.out.println("Called the method with arguments "+(arguments[0]));
			
			if( method.getName().equalsIgnoreCase("withdraw")) {
				if ((Double)arguments[0]  > ((SavingsAccount)target).getBalance()) {
					System.out.println("***********************************************");
					System.out.println("Insufficient funds");
					System.out.println("***********************************************");
				}
			}
		}
		
		
		for(Object obj: arguments) {
			System.out.println("Argument value: "+obj);
		}
		
		System.out.println(target);
		
	}

}
