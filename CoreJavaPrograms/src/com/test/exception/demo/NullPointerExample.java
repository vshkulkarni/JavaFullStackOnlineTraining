package com.test.exception.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.test.string.demo.Employee;

public class NullPointerExample {

	public static void main(String[] args) {
		
		try
		{
		Employee emp=new Employee(101, "vishnu","1000");
	
		List list=new ArrayList<>();
	//	System.out.println(emp.getId()+"--" +emp.getName()+emp.getAddress());
		
		list=Arrays.asList(emp.getAddress());
		System.out.println(list);
		}
		catch(ArrayIndexOutOfBoundsException|NullPointerException e)  //multi catch  //java8
		{
			
		}
	}

}
