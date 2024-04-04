package com.transport.india;

import java.util.Scanner;

public class DrivingCalculation {

	public static void main(String[] args) {
		int choice;
		double miles,per_galloncost,average_miles,Parking,Tolls,dailyCosttotal,totaloil,totaloilcost;
		
		Scanner sc= new Scanner(System.in);
			System.out.println("Total miles driven per day.:\n");
			miles=sc.nextDouble();
			System.out.println("Cost per gallon of gasoline\n");
			per_galloncost=sc.nextDouble();
			System.out.println("Average miles per gallon:\n");
			average_miles=sc.nextDouble();
			System.out.println("Parking fees per day:\n");
			Parking=sc.nextDouble();
			System.out.println("Tolls per day:\n");
			Tolls=sc.nextDouble();
//			dailyCost=(miles*average_miles*per_galloncost)+Parking+Tolls;
			totaloil=miles/average_miles;
			totaloilcost=totaloil*per_galloncost;
			dailyCosttotal=totaloilcost+Tolls+Parking;
			System.out.println("Daily driving cost:"+dailyCosttotal);
			
		

	}
	
	
	

}
