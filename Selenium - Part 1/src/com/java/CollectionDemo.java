package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

	// Generics No

	// Collection --> Group of elements in a single variable

	// Group of individual object as single entity
	public static void main(String[] args) {

		Collection<Object> obj = new ArrayList<>();

		obj.add(10);

		obj.add("Java");

		obj.add(89.04);

		obj.add('a');

		obj.add(true);
		
		obj.remove(89.04);

		System.out.println(obj);

		// For each

		for (Object o : obj) {

			System.out.println(o);
		}

		System.out.println("=============");

		// Iterator --> Interface

		Iterator<Object> it = obj.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

		System.out.println("=================");

		obj.stream().forEach((var) -> System.out.println(var));
		
//		obj.stream().forEach(System.out::println);

	}

}
