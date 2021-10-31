package com.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class gowtham {

	public static void main(String[] args) {
		String string = "HELLO JAVA JAVA JAVA HELLO WORLD";
		String[] str = string.split(" ",/s,"");
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String c : str) {
			if (map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c + 1));
			}
			System.out.println(map);
		}

	}
}
