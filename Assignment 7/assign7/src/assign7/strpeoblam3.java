package assign7;
import java.util.Scanner;



public class strpeoblam3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String text=sc.nextLine();
		String arr[]=text.split(" ");
		
		
		
		System.out.println("no of words in string:"+arr.length);
	}
	
}
