package com.test.java8features;

interface Addition // single abstract method //SAM
{
	int add(int a, int b, int c);  //5  
	default void display()
	{
		//implemented 
	System.out.println("display");	
	}
	default void display1()
	{
		//implemented 
	System.out.println("display");	
	}
	default void display2()
	{
		//implemented 
	System.out.println("display");	
	}
	
}

public class WithoutLambda {

	public static void main(String[] args) {
		Addition addition = (int x, int y, int a) -> x * y * a; // -> introduced in the java 8
		System.out.println(addition.add(10, 20, 20));
		addition.display();

	}

}


//CAR