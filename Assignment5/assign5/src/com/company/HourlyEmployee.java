package com.company;

import java.util.Scanner;
import com.company.Employee;

public class HourlyEmployee extends Employee {
	public HourlyEmployee(String firstName, String lastName, int socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(){};
	
	private double hourlywage,totalwage;
	private int hoursworked;

	Scanner sc= new Scanner(System.in);
	
	public HourlyEmployee(String firstName, String lastName, int socialSecurityNumber, double hourlywage,
			double totalwage, int hoursworked) {
		super(firstName, lastName, socialSecurityNumber);
		this.hourlywage = hourlywage;
		this.totalwage = totalwage;
		this.hoursworked = hoursworked;
	}


	@Override
	public void salary() {
		
		// TODO Auto-generated method stub
		if(hoursworked<=40)
		{
			totalwage=(hourlywage*hoursworked);
		}
		else 
		{
			totalwage=(40*hourlywage)+(hoursworked-40)*hourlywage*1.5;
		}
	}

	
	@Override
	public void accept() {
		// TODO Auto-generated method stub
		super.accept();
		
		System.out.println("enter hourlywage");
		hourlywage= sc.nextDouble();
		System.out.println("enter hoursworked");
		hoursworked= sc.nextInt();
		
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("houerly employee Salary of employee:"+totalwage);

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "firstname:"+getFirstName()+"  lastname:"+getLastName()+ " socialSecurityNumber:"+ getSocialSecurityNumber() +" totalwage:"+totalwage;

	}
}
