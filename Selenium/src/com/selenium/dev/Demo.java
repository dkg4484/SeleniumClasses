package com.selenium.dev;

public class Demo {

	private Demo m1() {

		System.out.println("Options - manage");
		
		return this;

	}

	private Demo m2() {

		System.out.println("Window - window");
		
		return this;

	}

	private void m3() {

		System.out.println("Maximize the window - maximize");

	}

	public static void main(String[] args) {

		Demo demo = new Demo();

		demo.m1().m2().m3();

	}

}
