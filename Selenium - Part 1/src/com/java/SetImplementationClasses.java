package com.java;

import java.util.Set;
import java.util.TreeSet;

public class SetImplementationClasses extends Object {

	public static void main(String[] args) {

		Set<Integer> set = new TreeSet<>() {
			{

				add(10);
				add(20);
				add(30);
				add(3);
				add(40);
				add(50);
				add(5);
				add(8);

			}
		};
		
		System.out.println(set);
	}

}
