package com.test.ds.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.test.string.demo.Employee;

public class ListDemo {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "vishnu", "10000");
		Employee emp1 = new Employee(102, "vishnu", "20000");
		Employee emp2 = new Employee(103, "vishnu", "3000");
		Employee emp3 = new Employee(104, "vishnu", "40000");

		List<Employee> list = new ArrayList<Employee>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		
		Collections.reverse(list);
		System.out.println(list.toString());

		for (Employee empIterate : list) {
			System.out.println(empIterate.getId());
			System.out.println(empIterate.getName());
		}

		Iterator<Employee> iterator = list.iterator();
		while (iterator.hasNext()) {
			//System.out.println("--" + iterator.next());
		}
		
		ListIterator<Employee> listIterator = list.listIterator();  //forward and backward direction 
		while (listIterator.hasPrevious()) {
			System.out.println("--" + listIterator.previous());
		}

	}
	
//List Set LinkedList   --  Legacy  Vector 

}
