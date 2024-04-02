package assignment2;
import java.util.Scanner;

public class assign2 {

	public static void main(String[]args)
	{
		double Num1, Num2, average;
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println("enter no:");
//		Num1= sc.nextDouble();
//		num2= sc.nextDouble();
		
		if(sc.hasNextDouble())
		{
			Num1= sc.nextDouble();
			

			if(sc.hasNextDouble())
			{
				Num2= sc.nextDouble();
				average=(Num1+Num2)/2;
				System.out.println("average :"+average);
				
				
			}
			else
			{
				System.out.println("num2 is not valid double value");
			}
		}
		else
		{
			System.out.println("num1 is not valid double value");
		}
		
	}
}
