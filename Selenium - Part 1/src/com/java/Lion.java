package com.java;

public class Lion implements Animal {

	@Override
	public void eat() {

		System.out.println("Chicken");

	}

	public static void main(String[] args) {

		Animal lion = new Lion();

		lion.eat();

	}

}
