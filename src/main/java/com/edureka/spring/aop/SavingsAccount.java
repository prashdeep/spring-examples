package com.edureka.spring.aop;

public class SavingsAccount {
	
	private double balance  = 20000;
	
	public void deposit(double balance) {
		this.balance += balance;
	}
	
	public double withdraw(double amount) {
		System.out.println("Inside the actual class....");
		if ( amount < balance) {
			this.balance -=amount;
		} else {
			amount = 0;
		}
		return amount;
	}
	
	public double getBalance() {
		return this.balance;
		
	}

}
