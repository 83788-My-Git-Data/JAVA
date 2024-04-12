package assign7;

import java.util.Scanner;

//import javax.sound.sampled.ReverbType;

public class palindrome {
	
	
	 public static void main(String[] args){
		// TODO Auto-generated constructor stub
		 
		 String no,reverseno="";
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter no. to check palindrome:");
		 no=sc.next();
		 String arr[]=no.split("");

		 
		 for(int i=no.length()-1;i>=0;i--)
		 {
//			 System.out.println(no);
			 reverseno=reverseno+arr[i];
		 }
		 
		if(no.equals(reverseno))
				{
			System.out.println("palandrom");
				}
		else
		{
			System.out.println("not palandrom");
		}
		

			sc.close();
		 
	}

	private static int parseInt(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
