package com.java;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo1 {

	public static void main(String[] args) {

		List<Integer> obj1 = new ArrayList<>();

		obj1.add(10);

		obj1.add(20);

		obj1.add(30);

		obj1.add(30);

		obj1.add(40);

		obj1.add(10);

		System.out.println(obj1);

		List<Integer> obj2 = new ArrayList<>();

		obj2.addAll(0, obj1);

		obj2.add(40);

		obj2.add(35);

		obj2.add(40);

		System.out.println(obj2);

		System.out.println(obj1.equals(obj2));

		System.out.println(obj2.containsAll(obj1));

		System.out.println(obj2.removeAll(obj1));

		System.out.println(obj1 + " " + obj2);

//		obj.add(1, 15);
//
//		System.out.println(obj);
//
//		int d = obj.get(3);
//
//		System.out.println(d);
//
//		System.out.println(obj.size());
//
//		System.out.println("How to Iterate the List....");
//
//		System.out.println("=======For loop============");
//
//		for (int i = 0; i < obj.size(); i++) {
//
//			System.out.println(obj.get(i));
//
//		}
//
//		System.out.println("======While loop=========");
//
//		int i = 0;
//
//		while (i < obj.size()) {
//
//			System.out.println(obj.get(i));
//
//			i++;
//		}
//
//		System.out.println("======Do while loop========");
//
//		int m = 0;
//
//		do {
//
//			System.out.println(obj.get(m));
//
//			m++;
//		} while (m < obj.size());
//
//		System.out.println("========Enhanced==========");
//
//		for (int o : obj) {
//
//			System.out.println(o);
//		}
//
//		System.out.println("=====Lamda=========");
//
//		obj.forEach((o) -> System.out.println(o));
//
//		System.out.println("==========Iterator===========");
//
//		Iterator<Integer> it = obj.iterator();
//
//		while (it.hasNext()) {
//
//			System.out.println(it.next());
//		}
//
//		System.out.println("========List Iterator=========");
//
//		ListIterator<Integer> lii = obj.listIterator();
//
//		while (lii.hasNext()) {
//
//			System.out.println(lii.next());
//		}
//
//		while (lii.hasPrevious()) {
//
//			System.out.println(lii.previous());
//		}
//
//		System.out.println("==========Size without size() method");
//
//		int count = 0;
//
//		for (int dd : obj) {
//
//			count++;
//
//		}
//
//		System.out.println(count);
//
//		System.out.println("==============================================");
//
////		System.out.println(obj.size());
////		
////		obj = new ArrayList<>();
////		
////		System.out.println(obj);
////		
//		boolean contains = obj.contains(20.5);
//
//		System.out.println(contains);
//
//		int hashCode = obj.hashCode();
//
//		System.out.println(hashCode);
////		
////		int indexOf = obj.indexOf(10.5);
////		
////		int indexOf1 = obj.lastIndexOf(10.5);
////		
//
////		System.out.println(indexOf);
////		
////		System.out.println(indexOf1);
////		
//
//		boolean empty = obj.isEmpty();
//
//		System.out.println(empty);
//
//		obj.remove(1);
//
//		obj.set(3, 1000);
//
//		System.out.println(obj);
//
//		List<Integer> subList = obj.subList(1, 4);
//
//		System.out.println(subList);
//
//		Object[] array = obj.toArray();
//
//		for (Object o : array) {
//
//			System.out.println(o);
//		}
//
//		System.out.println(obj);
//		
//		System.out.println(obj.size());
//		
//		String str = obj.toString();
//		
//		System.out.println(str);
//		
//		System.out.println(str.length());
//		
//		
//
////		obj.clear();
////		
////		System.out.println(obj.size());
////		
//
	}

}
