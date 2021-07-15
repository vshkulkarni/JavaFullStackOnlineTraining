package com.test.ds.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alex", "Charles", "Brian", "David");
		 
		//Natural order
		Collections.sort(names);    //[Alex, Brian, Charles, David]
		System.out.println(names.toString());
		 
		//Reverse order
		Collections.sort(names, Collections.reverseOrder());   // [David, Charles, Brian, Alex]  
		System.out.println(names);
		
		
		//Arrays.
		//Collecctions
		//Comparator --compare() //customized sorting
		//Comparable --compareTo()  //normal sorting
	}
}
