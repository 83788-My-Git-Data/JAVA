package com.company;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
	public SalariedEmployee(String firstName, String lastName, int socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
	}
	
	public SalariedEmployee(){};

	private double weeklySalary;
	int hours;

	Scanner sc= new Scanner(System.in);
	
	@Override
	public void salary() {
		
		System.out.println("weekly Salary of employee:"+weeklySalary);
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void accept() {
		// TODO Auto-generated method stub
		super.accept();
	
		System.out.println("enter weeklySalary");
		weeklySalary= sc.nextDouble();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("weekly Salary of employee:"+weeklySalary);

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "firstname:"+getFirstName()+"  lastname:"+getLastName()+ " socialSecurityNumber:"+ getSocialSecurityNumber() +" weeklySalary"+weeklySalary;
	}

}
