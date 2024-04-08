package com.app.basket;

import java.util.Scanner;
import com.app.fruits.*;
import java.util.Arrays;

public class testerbasket extends Fruit{

	public testerbasket() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		Fruit arr[]= new Fruit[10]; 
		int index=0;
		int choice;
		
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all fruits in the basket.");
			System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket.");
			System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits stale (optional)");
			System.out.print("Enter choice - ");
			choice=sc.nextInt();
			
			switch (choice) {
			case 0: {
				
				System.out.println("Thanks for using the app ...!");

			}
			
	case 1: {
				
				if(index<10)
				{
					arr[index]= new Mango();
					arr[index].acceptFruit(sc);
					index++;
break;
				}
				else
				{
					System.out.println("Basket is full...!");
				}

			}
	case 2: {
		
		if(index<10)
		{
			arr[index]= new Orange();
			arr[index].acceptFruit(sc);
			index++;
		}
		else
		{
			System.out.println("Basket is full...!");
		}
break;

	}
	case 3: {
		
		if(index<10)
		{
			arr[index]= new Apple();
			arr[index].acceptFruit(sc);
			index++;
		}
		else
		{
			System.out.println("Basket is full...!");
		}
break;

	}
	case 4: {
		//if(arr.length!=0) {
			for(Fruit element:arr)
			{
				if(element!=null)
				
				System.out.println("names of fruit:"+element.getName());
				
				else {
				
				}
			}
	
		}
		
		break;
	
case 5: {
		
//		for(int i=0 ;i<index;i++)
//		{
//			arr[i].displayFruit();
//		}
	if(arr.length!=0) {
		System.out.println(Arrays.toString(arr));
	}
	else
	{
		System.out.println("Basket is Empty...!");
	}
		break;
	}
case 6: {
	
	for(int i=0 ;i<index;i++)
	{
//		arr[i].displayFruitName();
		arr[i].displayFruitstale();
	}
	break;
}

case 7:
{
	int markstale;
	markstale=sc.nextInt();
	if(markstale>arr.length || markstale<0)
	{
		System.out.println("invalid index...!");
		break;
	}
		for(int i=0 ;i<arr.length;i++)
		{
		if(markstale==i)
		{
			arr[i].setFresh(false);
		}
	}
}
break;
//			default:
//				throw new IllegalArgumentException("Unexpected value: " + key);
			}
			
		} while (choice!=0);
		
	}

}
