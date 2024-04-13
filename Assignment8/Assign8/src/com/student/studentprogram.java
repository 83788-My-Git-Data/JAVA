package com.student;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class studentprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice = 0,value;

		
		student studentArr[] = new student[5];
		studentArr[0] = new student(1, "stu1", "bhilai", 99.9);
		studentArr[1] = new student(2, "stu2", "pune", 96.9);
		studentArr[2] = new student(3, "stu3", "karad", 49.9);
		studentArr[3] = new student(4, "stu4", "raipur", 69.9);
		studentArr[4] = new student(5, "stu5", "mumbai", 79.9);
		student s = new student();

		System.out.println("Before Sorting -");
		for (student studentdata : studentArr)
			System.out.println(studentdata);

		do {
			System.out.println("1. sorted on their city (asc):");
			System.out.println("2. sorted on their on marks (desc):");
			System.out.println("3. sorted on their on name (asc):");
			System.out.println("enter your choice:");
			  Scanner scanner = new Scanner(System.in);
			  
			choice=  scanner.nextInt();
			

			switch (choice) {
			case 1: {

				class studentcityclass implements Comparator<student> {

					@Override
					public int compare(student o1, student o2) 
					{
						// TODO Auto-generated method stub
						int value = o1.getCity().compareTo(o2.getCity());
						return value;
					}
				}
				
				Comparator<student> studentCityObj= new studentcityclass();
				
				Arrays.sort(studentArr, studentCityObj);
				break;
			}
			case 2: {

				class studentmarksclass implements Comparator<student> {

					@Override
					public int compare(student o1, student o2) 
					{
						// TODO Auto-generated method stub
						int value = (int)(o1.getMarks()-o2.getMarks());
//						 value =Double.compare(o1.getMarks(),o2.getMarks());
//						
						return -value;
					}
				}
				Comparator<student> studentmarksObj= new studentmarksclass();
				Arrays.sort(studentArr, studentmarksObj);
				break;
			}
			case 3: {

				class studentnameclass implements Comparator<student>
				{
					@Override
					public int compare(student o1, student o2) {
						int value = o1.getName().compareTo(o2.getName());
						return value;
					};
				}

				Comparator<student>studentnameObj= new studentnameclass();
				Arrays.sort(studentArr, studentnameObj);
				break;
			}

			}
			

			System.out.println("After Sorting -");
			for (student stu : studentArr)
				System.out.println(stu);

		} while (choice != 0);

	}

}
