package com.edureka.spring.core;

import java.util.List;

public class Person {

	private int id;
	private String name;

	private Address address;

	private List<String> courses;

	private List<Address> addresses;

	public Person(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	public void myCustomInit() {
		System.out.println("My custom init method");
	}
	
	public void myCustomDestroy() {
		System.out.println("My custom destro method");
	}
	

}
