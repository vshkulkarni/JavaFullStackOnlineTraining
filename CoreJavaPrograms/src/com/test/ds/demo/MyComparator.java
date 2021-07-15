package com.test.ds.demo;
import java.util.Comparator;

public class MyComparator implements Comparator{

	@Override
	public int compare(Object ob1, Object ob2) {
		
		Employee i1=(Employee)ob1;
		Employee i2=(Employee)ob2;
		String s1=i1.name;
		String s2=i2.name;
		
		return s1.compareTo(s2);
	/*	
		if(i1<i2)
			return +1;
		if(i1>i2)
			return -1;
		else
			return 0;
*/		
		
	}
}
