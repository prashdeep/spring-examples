package com.edureka.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);
		Student student = new Student();
		student.setName("Vikas");
		student.setAge(40);
		studentDAO.saveStudent(student);

		((AbstractApplicationContext) context).registerShutdownHook();
	}

}
