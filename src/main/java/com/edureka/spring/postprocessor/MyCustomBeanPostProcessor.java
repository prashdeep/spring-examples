package com.edureka.spring.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyCustomBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("Bean Post processor after initialization");
		System.out.println(arg0);
		System.out.println(arg1);
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("Bean post processor before initialization");
		System.out.println(arg0);
		System.out.println(arg1);
		return  arg0;
		
		
	}

}
