package com.app.fruits;

public class Apple extends Fruit {

	public Apple() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sweet n sour";
	}
}
