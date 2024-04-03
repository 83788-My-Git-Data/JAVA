package Tester;
import java.util.Scanner;
import com.app.geometry.*;

public class TestPoint {
	

	public static void main(String[] args) {
//		int x,y;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("x:");
//		x=sc.nextInt();
//		System.out.println("y:");
//		y=sc.nextInt();
//		
		Point2D p1=new Point2D();
		p1.accept();
		
		Point2D p2=new Point2D();
		p2.accept();

		if(p1.isEqual(p2))
		{
			System.out.println("p1 & p2 are located at the same\n"
					+ "position:"+ p2.getDetails());
		}
		else
		{
			System.out.println("distance between p1 & p2:"+p1.calculateDistance(p2));
			
		}
		
//		System.out.println(p1.getDetails());
		
		
	}

}
