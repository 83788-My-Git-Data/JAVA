package com.company;
import java.util.Scanner;

import com.company.Employee;

public class CommissionEmployee extends Employee {
	private double graossSales,commissionrate, CommissionEmployeeSalary;
	Scanner sc= new Scanner(System.in);
	
	public CommissionEmployee(String firstName, String lastName, int socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
	}

	public CommissionEmployee(){};
	
	@Override
	public void salary() {
		// TODO Auto-generated method stub
		CommissionEmployeeSalary=commissionrate*graossSales;
	}
	

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		super.accept();
		System.out.println("enter commissionrate");
		commissionrate= sc.nextDouble();
		System.out.println("enter graossSales");
		graossSales= sc.nextDouble();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Commission employee Salary of employee:"+CommissionEmployeeSalary);

	}
}
