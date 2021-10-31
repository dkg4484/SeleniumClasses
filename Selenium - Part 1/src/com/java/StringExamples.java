package com.java;

import java.util.Arrays;

public class StringExamples {

	public static void main(String[] args) {
		
		String str = "Welcome";
		
		char[] charArray = str.toCharArray();
		
		for(char c:charArray) {
			
			System.out.println(c);
		}

		
		String[] split = str.split("");
		
		Arrays.stream(split).forEach((var) -> System.out.println(var));
	}

}
