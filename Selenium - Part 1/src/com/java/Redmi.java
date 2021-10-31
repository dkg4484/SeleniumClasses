package com.java;

public class Redmi implements Mobile { // Concrete class

	@Override
	public void calling() {

		System.out.println("Calling");

	}

	@Override
	public void text() {

		System.out.println("MEssage");

	}

	@Override
	public void camera() {

		System.out.println("CAmera");

	}

	public static void main(String[] args) {

		Mobile mob = new Redmi();

		mob.calling();

		mob.text();

		mob.camera();

	}

}
