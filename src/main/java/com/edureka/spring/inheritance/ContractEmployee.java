package com.edureka.spring.inheritance;

public class ContractEmployee extends Employee{
	private int duration;
	private double payPerHour;
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getPayPerHour() {
		return payPerHour;
	}
	public void setPayPerHour(double payPerHour) {
		this.payPerHour = payPerHour;
	}

}
