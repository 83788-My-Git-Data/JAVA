package com.string.tester;
import java.util.Scanner;
//import exceptionHendling.string.strLen;
import com.string.tester.ExceptionLineToolong;
public class strlentester {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("enter  a line:");
		String line= sc.nextLine();
		if(line.length()>80)
			throw new ExceptionLineToolong("your line length is greater then 80 char");
		else
			System.out.println("your line is less then 80 char");
		
		
	} catch (ExceptionLineToolong e) {
		
e.printStackTrace();
		
		// TODO: handle exception
	}
}




}
