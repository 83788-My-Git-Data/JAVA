package com.library;

import java.util.Scanner;

enum BookCategory{
A,
B,
Political,
Reference,
Religious,
Royalty
}


public class LibraryBook {
	public static final String category = null;
	String isbn;
	BookCategory Category ;
	double price;
	String authorName;
	int quantity;
	
	public LibraryBook(String isbn, BookCategory category, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.Category = category;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public LibraryBook() {
		super();
	}

	@Override
	public String toString() {
		return "LibraryBook [isbn=" + isbn + ", Category=" + Category + ", price=" + price + ", authorName="
				+ authorName + ", quantity=" + quantity + "]";
	}
	
//	public void accept()
//	{
//		Scanner sc=new  Scanner(System.in);
//		
//		
//		System.out.println("enter isbn:");
//		this.isbn=sc.next();
//		
//		System.out.println("enter Category:");
//		this.Category =Category.valueOf(sc.next());
//		
//		System.out.println("enter price:");
//		this.price =sc.nextDouble();
//		
//		System.out.println("enter authorName:");
//		this.authorName =sc.next();
//		
//		System.out.println("enter quantity:");
//		this.quantity =sc.nextInt();
//		
//		LibraryBook libbook=new LibraryBook(this.isbn,this.Category,this.price,this.authorName,this.quantity);
//		//     return ;
//		//this.Category=sc.next();
//		
//	}
//	
	
	public static void main(String[] args) {
		
	}
}
