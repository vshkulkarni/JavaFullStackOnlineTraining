package com.test.poly.dmo;

public class MethodOverloadingEx {

	static public int  add(int a,int b,int c)
	{
		return a+b+c;
	}
	static public float  add(int a,int b)
	{
		return a+b;
	}
	static public float  add(float a,float b)
	{
		return a+b;
	}
	
	static public Double  add(Double a,Double b)
	{
		return a+b;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(add(20,20,30));
		
	}
	

}

