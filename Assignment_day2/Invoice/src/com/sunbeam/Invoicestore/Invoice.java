package com.sunbeam.Invoicestore;

public class Invoice {

	private String PartNO;
	private String description;
	private int quantity;
	private double price;
	private double total;
	
	public Invoice() {
		
	this("id01","desc11",43,4.4);
	
	}
	
	
	public Invoice(String partNO, String description, int quantity, double price) {
	
		PartNO = partNO;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}


	public String getPartNO() {
		return PartNO;
	}




	public void setPartNO(String partNO) {
		PartNO = partNO;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}

	public double priceperitem(int quantity,double price)
	{
		if(quantity<0)
		{
			this.quantity=0;
		}
		else
		{
			this.quantity=quantity;
		}
	
		if(price<0)
		{
			this.price=0;
		}
		else
		{
			this.price=price;
		}
		
		return  total=this.price*this.quantity;
	}
	
	public void displayinvoice()
	{
		System.out.println("PartNO:"+this.PartNO+"\n description:"+this.description+"\n quantity:"+this.quantity+"\n price:"+this.price);
	}

}
