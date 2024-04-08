package com.app.fruits;

import java.util.Scanner;


public class Fruit {

	private String name;
	private String color ;
	private double weight ;
	private boolean isFresh ;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	
	public Fruit(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	
	public String taste()
	{
		return "no specific taste";
	}
	public void acceptFruit(Scanner sc)
	{
		int checkfresh;
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter color");
		color=sc.next();
		System.out.println("enter weight");
		weight=sc.nextDouble();
		System.out.println("1.Fresh ");
		System.out.println("2.Not Fresh ");
		checkfresh=sc.nextInt();
		if(checkfresh==1)
		{
			isFresh=true;
		}
		else
		{
			isFresh=false;
		}
		
		
	}
	
	public void displayFruit()
	{
		System.out.println("Fruit:"+getName());
		System.out.println("color:"+getColor());
		System.out.println("weight:"+getWeight());
		if(isFresh==false)
		{
		System.out.println("Fresh or Not?:" +"Not Fresh");
		}
		else if(isFresh==true)
		{
			System.out.println("Fresh or Not?:"+ "Fresh");
			}
		System.out.println("taste:"+taste());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "  Fruit:"+getName()+"  color:"+getColor()+"  weight:"+getWeight()+getterisFresh();
	}
	
	
	public String getterisFresh()
	{
		 if(isFresh==true)
		{
			return "Fresh or Not?:"+ "Fresh";
			}
		return "Fresh or Not?:"+ "Not Fresh";
	}
		
//	}
	public void displayFruitName()
	{
		
		System.out.println("Fruit:"+name);
		
	}
	
	public void displayFruitstale()
	{
		System.out.println("Fruit:"+name);
		
		if(isFresh==false)
		{
		System.out.println("taste:" +taste());
		}
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
