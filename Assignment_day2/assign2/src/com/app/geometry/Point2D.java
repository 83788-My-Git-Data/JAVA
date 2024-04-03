package com.app.geometry;
import java.lang.Math;
import java.util.Scanner;

public class Point2D {
	private int x;
	private int y;
	
	public Point2D(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	public Point2D() {
		this(0,0);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	/////logical functions of assign///
	public String getDetails() {
		String details;
		details=this.x+","+this.y;
		return details;
	}
	
	public void accept()
	{
//		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("x:");
		this.x=sc.nextInt();
		System.out.println("y:");
		this.y=sc.nextInt();
		System.out.println("points value:"+ this.getDetails());
	}

	
	public boolean isEqual(Point2D point)
	{
		if(this.x==point.x && this.y==point.y)
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	
	public double calculateDistance(Point2D point)
	{
		double distance= Math.sqrt((double)Math.pow((this.x-point.x),2)+Math.pow((this.y-point.y), 2));
		return distance;
	}
	
//	dis for. √((x2 – x1)² + (y2 – y1)²)
	//end logical funcations///

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
