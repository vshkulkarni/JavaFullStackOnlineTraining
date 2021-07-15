package com.test.string.demo;

public class StringDemo {

	public static void main(String[] args) {

		
		String str2 = "One"; // new object cannot create it wont store old values
		String Str3="One";
		
		//if(str2.equalsIgnoreCase("ONE"))
		if(str2.equalsIgnoreCase(Str3))
		{
			str2=new String("ten");
			System.out.println("-" + str2);
		}
		
	
		
		
		
	/*	StringBuilder sb=new StringBuilder("one");   //append 
		sb.append("two");
		sb.append("three");
		System.out.println("###-"+sb);
		
		
		
		//multithreading scanrios we should use the Stringbuffer 
		
		StringBuffer sbuffer=new StringBuffer("one");   //append    //multithreading programming 
		sbuffer.append("two");
		sbuffer.append("three");
		System.out.println("###-"+sbuffer);*/
		
		
		
		
		
		
		
		
		
		
		


	}

}
