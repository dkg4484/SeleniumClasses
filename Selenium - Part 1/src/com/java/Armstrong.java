package com.java;

public class Armstrong {

	public static void main(String[] args) {

		int value = 153;
		int i = 0;
		int reminder = 0;
		int temp = 0; // temporary
		value = temp;

		while (value > 0) {
			i = value % 10;// 153%10 --> 3
			reminder = reminder + (i * i * i);// 27
			

		}

	}

}
