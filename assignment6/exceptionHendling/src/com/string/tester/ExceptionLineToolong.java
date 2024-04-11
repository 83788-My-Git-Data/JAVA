package com.string.tester;

public class ExceptionLineToolong extends Exception {
	
	private String strtext;
	private int strlength;
	public ExceptionLineToolong(String strtext, int strlength) {
		super();
		this.strtext = strtext;
		this.strlength = strlength;
	}
	
	public ExceptionLineToolong() {
		// TODO Auto-generated constructor stub
		this.strtext = "";
		this.strlength=strlength;
	}

	public ExceptionLineToolong(String strtext) {
		
		
		this.strlength=strlength;
		this.strtext = strtext;
	}
	
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
		System.err.println("Exception:");
		System.err.println("string:"+strtext);
		System.err.println("string length:"+strlength);
	}

}
