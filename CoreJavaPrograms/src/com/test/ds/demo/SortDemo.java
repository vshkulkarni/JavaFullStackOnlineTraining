package com.test.ds.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) throws Exception {

		ArrayList<Employee> empArraylist = new ArrayList<>();
		empArraylist.add(new Employee("XX", 10010));
		empArraylist.add(new Employee("XYZ", 102));
		empArraylist.add(new Employee("ABC", 100));
		empArraylist.add(new Employee("PQR", 101));
		empArraylist.add(new Employee("AAB", 103));
		empArraylist.add(new Employee("ABCV", 500));

		Collections.sort(empArraylist, new MyComparator());

		System.out.println(empArraylist);

	}

}
