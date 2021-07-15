package com.test.ds.demo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

	
		Set<Integer> set = new HashSet<Integer>(10); // unique data
		set.add(100);
		set.add(50);
		set.add(5);  
		set.add(1);
		set.add(600);
		set.add(600);
		set.add(101);
		
		System.out.println(set);
		
		
		TreeSet<Integer> treeset = new TreeSet<Integer>(); // unique data sorted 
		treeset.add(100);    //data  
		treeset.add(50);
		treeset.add(5);
		treeset.add(1);
		treeset.add(600);
		treeset.add(600);
		treeset.add(101);
		
		System.out.println(treeset);

		
	}

}

