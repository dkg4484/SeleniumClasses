package com.java;

public class MainClass {

	public static void main(String[] args) {

		Functions fun = new Functions();

		fun.launchUrl(Functions.readPropertyFile("browserName"), Functions.readPropertyFile("url"));
		
		

	}

}
