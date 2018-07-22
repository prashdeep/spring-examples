package com.edureka.spring.inheritance;

public class RegularEmployee extends Employee {
	
	private double fixedSalary;
	private double bonus;
	public double getFixedSalary() {
		return fixedSalary;
	}
	public void setFixedSalary(double fixedSalary) {
		this.fixedSalary = fixedSalary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
