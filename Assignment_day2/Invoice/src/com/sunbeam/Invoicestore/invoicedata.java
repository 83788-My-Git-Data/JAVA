package com.sunbeam.Invoicestore;
//import com.sunbeam.Invoicestore.Invoice.*;

public class invoicedata {
	public static void main(String[] args) {

//		Invoice I1=new Invoice();
		Invoice I1=new Invoice("emp1","d11",4,55.3);
		I1.displayinvoice();
		I1.setPrice(15);
		I1.setPrice(5);
		System.out.println("total:"+I1.priceperitem(4,6.2));
	}
}
