package com.edureka.spring.autowire;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Person {

	private int id;
	private String name;

	@Autowired(required=true)
	@Qualifier(value="newAddress")
	private Address address;

	private List<String> courses;



	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void myCustomInit() {
		System.out.println("My custom init method");
	}
	
	public void myCustomDestroy() {
		System.out.println("My custom destro method");
	}
	

}
