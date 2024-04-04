package tester;
import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		int choice,dp1,dp2,noOfPoints;
		System.out.println("how many no of points to plot from user: \n");
		Scanner sc= new Scanner(System.in);
//		noOfPoints=sc.nextInt();
		Point2D[] points=new Point2D[sc.nextInt()];
		for(int i=0;i<points.length;i++)
		{
			points[i]=new Point2D();
			points[i].accept();
		}
		
		do {
			System.out.println("1. Display details of a specific point:\n");
			System.out.println("2) Display x, y co-ordinates of all points:\n");
			System.out.println("3) User i/p : 2 indices for the points , validate the indices:\n");
			System.out.println("4. Exit:\n");
			choice=sc.nextInt();
		
		
		switch(choice) 
		{
		case 1:
			System.out.println("4. enter index of point:\n");
		    int	findPoint=sc.nextInt();
			
				if(findPoint<points.length && findPoint>=0)
				{
					System.out.println("point:"+points[findPoint].getDetails());
				}
				else if(findPoint>points.length || findPoint<0)
				{
					System.out.println("Invalid index , pls retry!!!!\n");
				}
			
			break;

		case 2:
			for(Point2D element:points)
				element.getDetails();
			
			for(int i=0;i<points.length;i++)
			{
			System.out.println("point at index"+i+":"+points[i].getDetails() );
			}

			break;
		case 3:
			System.out.println("enter 1st point index for calculate distance: \n");
			dp1=sc.nextInt();
			System.out.println("enter 2nd point index for calculate distance: \n");
			dp2=sc.nextInt();
			if(points[dp1].isEqual(points[dp2]))
			{
				System.out.println("p1 & p2 are located at the same\n"
						+ "position:"+ points[dp2].getDetails());
			}
			else
			{
				System.out.println("distance between p1 & p2:"+points[dp1].calculateDistance(points[dp2]));
				
			}

			break;
			
		case 4:
			System.out.println("4. Thankyou for using this App:\n");
			break;

		}
		}while(choice!=4);
		
	}

}
