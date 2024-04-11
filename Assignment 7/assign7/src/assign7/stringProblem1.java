package assign7;

import java.util.Scanner;

public class stringProblem1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String text=sc.nextLine();
		
		StringBuilder kk= new StringBuilder(text);
		
		System.out.println("reverse of string:"+ kk.reverse());
		
		sc.close();
				}

}
