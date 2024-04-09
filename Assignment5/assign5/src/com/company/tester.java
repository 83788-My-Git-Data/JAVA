package com.company;
import java.util.Scanner;
import com.company.Employee;

import com.company.Employee.*;

public class tester {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int emptypechoice;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1.weeklysalary employee type:");
		System.out.println("2.HourlyEmployee employee type:");
		System.out.println("3.CommissionEmployee employee type:");
		System.out.println("4.BaseplusCommissionEmployee employee type:");
		System.out.println("enter employee type:");
		emptypechoice=sc.nextInt();
		switch (emptypechoice) {
		case 1: {
			Employee obj= new SalariedEmployee();
			obj.accept();
			obj.salary();
			System.out.println(obj.toString());
//			obj.display();
			break;
		}
		case 2: {
			Employee obj= new HourlyEmployee();
			obj.accept();
			obj.salary();
//			obj.display();
			System.out.println(obj.toString());
			break;
		}
		case 3: {
			Employee obj= new CommissionEmployee();
			obj.accept();
			obj.salary();
			obj.display();
			break;
		}
		case 4: {
			Employee obj= new BaseplusCommissionEmployee();
			obj.accept();
			obj.salary();
//			obj.display();
			System.out.println(obj.toString());
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + emptypechoice);
		}
//		Employee obj =new SalariedEmployee();

	}

}
