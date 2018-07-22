package com.edureka.spring.core;

public class Address {
	
	private String street;
	private String city;
	private String state;
	
	public Address() {}
	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	public void myCustomInit() {
		System.out.println("Initializing the database connection");
	}
	
	public void myCustomDestroy() {
		System.out.println("Inside the customDestroy method");
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
