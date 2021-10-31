package com.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

//	int --> Integer
//	float --> Float
//	char --> Character
//	short --> Short
//	long --> Long
//	byte --> Byte
//	boolean --> Boolean
//	double3 --> Double

	// Set --> Collection

	//

	public static void main(String[] args) {
		
		// Implementations

		List<Integer> lL = new LinkedList<>();
		
		List<Integer> aL = new ArrayList<>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		Set<Character> set = new HashSet<>() {
//			{
//
//				add('a');
//				add('1');
//				add(':');
//				add('&');
//				add('b');
//				add('d');
//
//				add('e');
//			}
//		};
//
////		Iterator<Character> it = set.iterator();
////		
////		System.out.println(it.next());
////		System.out.println(it.next());
////		System.out.println(it.next());
//
//		System.out.println(set);
//
////		List<Character> list = new ArrayList<>(set);
////		
////		System.out.println(list);
////		
//		System.out.println("==================");
//
//		List<Character> list = new ArrayList<>();
//
//		Iterator<Character> it = set.iterator();
//
//		while (it.hasNext()) {
//
//			Character ch = it.next();
//
//			list.add(ch);
//		}
//
//		System.out.println(list + " " + set);
//		
//		System.out.println(list.get(4));
//
//		// List to Set
//
//		// Set to List
//
//		// Style 1
//
////		List<String> list = new ArrayList<>() {
////			{
////
////				add("Anbu");
////				add("Babu");
////				add("Creg");
////				add("Creg");
////
////			}
////		};
////
////		Set<String> set = new HashSet<>();// list);
////
//////		System.out.println(list);
//////		
//////		System.out.println(set);
////		
//		// Style 2
//
//		System.out.println("===============");
//
//		for (int i = 0; i < list.size(); i++) {
//
//			String s = list.get(i);
//
//			set.add(s);
//
//		}

//		System.out.println("List values :" + list + " :::: " + "Set Values : " + set);

		// add
		// isEmpty
		// contains
		// clear
		// addAll
		// equals
		// remove
		// size

//
//		List<Integer> list1 = new ArrayList<>() {
//			{
//
//				add(10);
//
//				add(20);
//
//				add(30);
//
//			}
//		};

//		List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
//		List<Integer> list2 = new ArrayList<>(Arrays.asList(1000, 2000));

//		list1.addAll(3, list2);

//		System.out.println(list1 + " " + list2);

//		System.out.println("===============");
//
//		Object[] array = list1.toArray();
//
//		System.out.println(array[3]);
//
//		String str = list1.toString();
//
//		System.out.println(list1);
//
//		System.out.println(str);
//
//		System.out.println(str.length());

//		List<Integer> subList = list1.subList(2, 6);

//		System.out.println(subList);
//
//		boolean containsAll = list1.containsAll(list2);
//
//		System.out.println(containsAll);
//
//		boolean equals = list1.equals(list2);
//
//		System.out.println(equals);

//		list.add(10);
//
//		list.add(20);
//
//		list.add(30);
//
//		list.add(40);
//
//		list.add(2, 15);
//
//		list.add(10);
//
////		System.out.println(list);
////		
////		list.clear();
////		
////		System.out.println(list);
////		
////		list.add(10);
////		
////		System.out.println(list);
////		
////		list = new ArrayList<>();
////		
////		System.out.println(list);
//
//		boolean b1 = list.contains(10);
//
//		System.out.println(b1);
//
//		int i = list.indexOf(15);
//
//		System.out.println(i);
//
//		int indexOf = list.indexOf(100);
//
//		System.out.println(indexOf);
//
//		int lastIndexOf = list.lastIndexOf(10);
//
//		System.out.println(lastIndexOf);
//
//		boolean empty = list.isEmpty();
//
//		System.out.println(empty);
//		
////		list.remove(15);
//		
//		System.out.println(list);
//		
//		list.set(0, 1000);
//		
//		System.out.println(list);
//		
//		list.

//		list = new ArrayList<>();
//
//		System.out.println(list.isEmpty());

		/*
		 * System.out.println("Value at particular index" + list.get(2));
		 * 
		 * int length = list.size();
		 * 
		 * System.out.println("Size of list " + length);
		 * 
		 * System.out.println("============");
		 * 
		 * for (int i = 0; i < list.size(); i++) {
		 * 
		 * System.out.println(list.get(i));
		 * 
		 * }
		 * 
		 * System.out.println("============");
		 * 
		 * int m = 0;
		 * 
		 * while (m < list.size()) {
		 * 
		 * System.out.println(list.get(m));
		 * 
		 * m++; }
		 * 
		 * System.out.println("============");
		 * 
		 * int n = 0;
		 * 
		 * do {
		 * 
		 * System.out.println(list.get(n));
		 * 
		 * n++;
		 * 
		 * } while (n < list.size());
		 * 
		 * System.out.println("============");
		 * 
		 * for (int l : list) {
		 * 
		 * System.out.println(l); }
		 * 
		 * System.out.println("============");
		 * 
		 * list.stream().forEach(System.out::println);
		 * 
		 * System.out.println("============");
		 * 
		 * Iterator<Integer> it = list.iterator();
		 * 
		 * while (it.hasNext()) {
		 * 
		 * System.out.println(it.next()); }
		 * 
		 * System.out.println("================");
		 * 
		 * ListIterator<Integer> it1 = list.listIterator();
		 * 
		 * while (it1.hasNext()) {
		 * 
		 * System.out.println(it1.next()); }
		 * 
		 * while (it1.hasPrevious()) {
		 * 
		 * System.out.println(it1.previous()); }
		 */

	}
}