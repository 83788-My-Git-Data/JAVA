package com.company;

import java.util.Scanner;

public abstract class Employee {
	private String  firstName;
	private String  lastName;
	private int socialSecurityNumber;
	
	public abstract void salary();

	public Employee(String firstName, String lastName, int socialSecurityNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public Employee(){};
	
	public void accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter employee firstname:");
		firstName=sc.next();
		System.out.println("enter employee lastname:");
		lastName=sc.next();
		System.out.println("enter employee socialSecurityNumber:");
		socialSecurityNumber=sc.nextInt();
	}
	
	public void display()
	{
		System.out.println("enter employee firstname:"+firstName);
		System.out.println("enter employee lastname:"+lastName);
		System.out.println("enter employee socialSecurityNumber:"+socialSecurityNumber);
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	
	
	
	

}
