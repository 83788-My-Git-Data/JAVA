package assignment3;
import java.util.Scanner;


public class assign3 {
	public static void main(String[]args)
	{
		int choice=0, quantity=0;
		double total=0;
		Scanner sc = new Scanner(System.in) ;
		do
		{
			System.out.println("1.Dosa:50 \n"
					+ "2. Samosa:30 \n"+"3. Idli= 30 \n" +"4.poha ;20 \n"+"5.rajma ;50 \n"+"6. paneer ;200 \n"+"7. nooles ;50 \n"+"10 . Generate Bill\n");
			
			System.out.println("enter choice:");
			choice=sc.nextInt();
			if(choice!=10)
			{
			System.out.println("enter quantity:");
			quantity = sc.nextInt();
			}
			
			switch(choice)
			{
			case 1:
				total=50*quantity+total;
				break;
				
			case 2:
				total=30*quantity+total;
				break;
			case 3:
				total=30*quantity+total;
				break;
			case 4:
				total=20*quantity+total;
				break;
				
			case 5:
				total=50*quantity+total;
				break;
			case 6:
				total=200*quantity+total;
				break;
			case 7:
				total=50*quantity+total;
				break;
			case 10:
//				System.out.println("total bill:"+total);
				break;
				
			}
				
			
		}while(choice!=10);
		
		System.out.println("total bill:"+total);
	}

}
