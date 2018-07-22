package com.edureka.spring.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("************************************");
		System.out.println("Came inside the postProcessAfterInit method");
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("************************************");
		System.out.println("Came inside the postProcessBeforeInit method");
		return arg0;
	}

}
