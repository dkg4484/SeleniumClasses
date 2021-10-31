package com.java;

import java.util.Arrays;

public class StringDemo {

	public static void splitString(String str) {

		String[] split = str.split("a");

		Arrays.stream(split).forEach(System.out::println);

	}

	public static String greetings(String name) {

		return "Hello ".concat(name).concat("!");
	}

	public static String getsubString(String name) {

		return name.substring(0, name.length() / 2);

	}

	public static String nonStart(String a, String b) {

		return a.substring(1) + b.substring(1);

	}

	public static boolean compareTwoStrings(String a, String b) {

		return a.equalsIgnoreCase(b);

	}

	public static int compareStrings(String a, String b) {

		return a.compareToIgnoreCase(b);

	}

	public static String convertUpperCase(String name) {

		return name.toUpperCase();
	}

	public static String converLowerCase(String name) {

		return name.toLowerCase();

	}

	public static boolean checkValue(String str) {

		// startsWith, endsWith, contains -->
//				To validate partial value

		return str.contains("Nkm");

	}

	public static int indexFunction(String str) {

		return str.lastIndexOf('c');
	}

	public static boolean checkEmpty(String str) {

		// isEmpty() vs isBlank()

		return str.isEmpty();

	}

	public static void toStringValue(int x) {

		String s1 = String.valueOf(x);

		char[] ch = s1.toCharArray();

		for (char c : ch) {

			System.out.println(c);
		}

	}

	public static String replaceWord(String str) {

		return str.replaceAll("Java", "Selenium");
	}

	// Welcome --> False

	// --> True

	public static void main(String[] args) {

		String str = "Welcome@to@Java@training";

		splitString(str);

		System.out.println(greetings("Bob"));

		System.out.println(getsubString("abcdef"));

		System.out.println(nonStart("abc", "def"));

		System.out.println(compareTwoStrings("Dinesh Kumar", "Dinesh kumar"));

		System.out.println(compareStrings("java", "jAvA"));

		System.out.println(convertUpperCase("welcome to java session"));

		System.out.println(converLowerCase("welcome JAVA Training"));

		System.out.println(checkValue("$Nk1m101"));

		System.out.println(indexFunction("cdhjdkccdhjcdk"));

		System.out.println(checkEmpty(" "));

		toStringValue(1535635);

		System.out.println(replaceWord("Welcome to Java"));

		// "Welcome to Java"---> Welcome to Selenium

	}

}
