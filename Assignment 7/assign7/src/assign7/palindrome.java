package assign7;

import java.util.Scanner;

//import javax.sound.sampled.ReverbType;

public class palindrome {
	
	
	 public static void main(String[] args){
		// TODO Auto-generated constructor stub
		 
		 int no;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter no. to check palindrome:");
			 no=sc.nextInt();
			
			StringBuilder kk= new StringBuilder(no);
			int kkint=Integer.parseInt(kk.toString());
			System.out.println(no==kkint);
			
			sc.close();
		 
	}

	private static int parseInt(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
