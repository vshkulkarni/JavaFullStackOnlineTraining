package com.test.ds.demo;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("ABC");
		linkedList.add("PQR");
		linkedList.add("XYZ");
		linkedList.add("TEST");
		System.out.println(linkedList);
		linkedList.remove("ABC");
		System.out.println(linkedList);
	}
}
