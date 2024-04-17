package com.library;
import com.library.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class project01 {
	
	static Set<LibraryBook> booklist1=new HashSet<>();
public static void main(String[] args) {
	
	LibraryBook book1=new LibraryBook();
//	
//	Set<Student> studentList = new HashSet<>();
//	studentList.add(new Student(105, "Sham", 80));String isbn, BookCategory category, double price, String authorName, int quantity
	//Set<LibraryBook> booklist=new HashSet<LibraryBook>();
//	booklist.add(new LibraryBook("101",1,200,"kriti",9));
	
	
//		
	int choice;
	Scanner sc=new  Scanner(System.in);
	
	do {
		
	System.out.println("0. EXIT:");
	System.out.println("1. Accept book details and add in collection");
	System.out.println("2.Display all books from collection:");
	System.out.println("3. Sort the book details as per category and display it.:");
	System.out.println("4. Sort the book details as per author and display it:");
	System.out.println("5. Find book by id:");
	
	System.out.println("enter choice:");
	choice=sc.nextInt();
	
	switch (choice) {
	case 1: {
		
//		book1.accept();
		
		accept(sc);
	
		break;
	}
case 2: {
		for (LibraryBook Book : booklist1) {
			System.out.println(Book);
		}
		
		break;
	}
case 3: {
	
	
	List<LibraryBook> sortcategory=new ArrayList();
	sortcategory.addAll(booklist1);
	

	class Studentcatsortclass implements Comparator<LibraryBook> {
			@Override
			public int compare(LibraryBook o1, LibraryBook o2) {
				int value= o1.Category.name().compareTo(o2.Category.name());
				return value;
			}
	}
	
	Comparator<LibraryBook> catObj= new Studentcatsortclass();
	List<LibraryBook> lib=new ArrayList<>();
	Collections.sort(lib, catObj);
	
	
	for (LibraryBook ele : lib)
		System.out.println(ele);
	

	
	break;
}
case 4: {
	
break;
}
case 5: {


break;
}
	
	
}
	} while (choice!=0);
}
	


public static void accept(Scanner sc)
{
	
	
	
	System.out.println("enter isbn:");
	 String isbn=sc.next();
	
	System.out.println("enter Category:");
	BookCategory category =BookCategory.valueOf(sc.next());
	
	System.out.println("enter price:");
	 double price =sc.nextDouble();
	
	System.out.println("enter authorName:");
	String authorName =sc.next();
	
	System.out.println("enter quantity:");
	int quantity =sc.nextInt();
	
	LibraryBook libbook=new LibraryBook(isbn,category,price,authorName,quantity);
	booklist1.add(libbook);
	//     return ;
	//this.Category=sc.next();
	
}

}
