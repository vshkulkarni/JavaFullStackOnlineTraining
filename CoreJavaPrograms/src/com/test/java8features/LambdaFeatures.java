package com.test.java8features;

interface FuncInter1 {
	int sum(int a, int b);

	default void display() {
		System.out.println("this is display method ");
	}
}

public class LambdaFeatures {
	public static void main(String[] args) {
		FuncInter1 addValues = (int x, int y) -> x * y;

		System.out.println(addValues.sum(10, 20));
		addValues.display();
		
		
	}
}


