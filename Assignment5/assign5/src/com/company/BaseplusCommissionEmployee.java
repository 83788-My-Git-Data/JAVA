package com.company;

import java.util.Scanner;

public class BaseplusCommissionEmployee extends Employee {

	public BaseplusCommissionEmployee(String firstName, String lastName, int socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
	}
	public BaseplusCommissionEmployee(){};
	private double graossSales,commissionrate, baseCommissionSalary,basesalary;

	
	Scanner sc= new Scanner(System.in);
	
	@Override
	public void salary() {
		// TODO Auto-generated method stub
		baseCommissionSalary=((commissionrate*graossSales)+basesalary)*0.1;
	}
	

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		super.accept();
		System.out.println("enter commissionrate");
		commissionrate= sc.nextDouble();
		System.out.println("enter graossSales");
		graossSales= sc.nextDouble();
		System.out.println("enter basesalary");
		basesalary= sc.nextDouble();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Commission employee Salary of employee:"+baseCommissionSalary);

	}

}
