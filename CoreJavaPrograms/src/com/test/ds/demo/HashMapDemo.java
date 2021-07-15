package com.test.ds.demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1010, "ABC"); // hashcode //entryset
		map.put(102, "ABC");
		map.put(106, "XYZ");
		map.put(10, "Test");
		
		Collections.synchronizedMap(map);

		System.out.println(map.keySet());
		System.out.println(map.values());

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();   //impact the performance  unique 
		treeMap.put(1010, "ABC"); // hashcode //entryset
		treeMap.put(102, "ABC");
		treeMap.put(106, "XYZ");
		treeMap.put(10, "Test");

		System.out.println(treeMap.keySet());
		System.out.println(treeMap.values());

		// scanarios
		// sorting data treemap
		// dont want sorted data Hashmap
		// performance

	}

}
