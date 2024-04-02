package assign1;
import java.util.Scanner;

public class assignment1 {
	
	public static void main(String[]args)
	{
		int Num;
		String Binary,Oct,Hex;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no:");
		Num=sc.nextInt();
		Binary = Integer.toBinaryString(Num);
		Oct= Integer.toOctalString(Num);
		Hex=Integer.toHexString(Num);
		

		System.out.println("binary of no.: " + Binary);
		System.out.println("octal of no.: " + Oct);
		System.out.println("hexadecimal of no.: " + Hex);
		
	}

}
