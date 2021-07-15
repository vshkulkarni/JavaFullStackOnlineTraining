package com.test.ds.demo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector vector = new Vector();
		vector.add("100"); // duplicate data element
		vector.add("200");
		vector.add("100");
		System.out.println(vector);

		// vector datastructor 1.2

		// synch
		// how we are storing the data
		// duplicate capacity size ,
		// performace

		// Iterator
		Enumeration enumer = vector.elements();
		while (enumer.hasMoreElements()) {
			System.out.println(enumer.nextElement());
		}
	}

}
