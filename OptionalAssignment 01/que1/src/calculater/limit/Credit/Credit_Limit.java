package calculater.limit.Credit;
import java.util.Scanner;

public class Credit_Limit {
	private int accountNumber;
	private double new_balance,pendingBalance,itemsCharged,creditsApplied,creditLimit,AllowedCredit;
	
	Scanner sc=new Scanner(System.in);
	
	public void accept()
	{
		System.out.println("Allowed Credit =");
		AllowedCredit= sc.nextDouble();		
		System.out.println("total items charged =");
		itemsCharged= sc.nextDouble();		
		System.out.println("total all credit applied in this month=");
		creditsApplied= sc.nextDouble();		
		System.out.println("pending balance at the begining of the month =");
		pendingBalance= sc.nextDouble();		
	
	}
	
	public void calculate()
	{
		new_balance= pendingBalance + (itemsCharged - creditsApplied);
		if(new_balance<=AllowedCredit)
		{
			System.out.println("Allowed Limit...!");
		}
		else
		{
			System.out.println("Not Allowed Limit...!");
		}
	}
	public static void main(String[] args)	{
		
		Credit_Limit c1= new Credit_Limit();
		
		c1.accept();
		c1.calculate();
		
	}
	

}
