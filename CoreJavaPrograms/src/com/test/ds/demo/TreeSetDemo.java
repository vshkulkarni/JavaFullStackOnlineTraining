package com.test.ds.demo;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Employee e1=new Employee("nag",100);
		Employee e2=new Employee("balaiha",200);
		Employee e3=new Employee("chiru",501);
		Employee e4=new Employee("venki",1501);
		Employee e5=new Employee("test",1001);
		TreeSet ts=new TreeSet();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		System.out.println(ts);
		
		TreeSet ts1=new TreeSet(new MyComparator());
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		ts1.add(e5);
		System.out.println(ts1);
		//Map map=new HashMap<String,String>();*/
		
		
	}

}
