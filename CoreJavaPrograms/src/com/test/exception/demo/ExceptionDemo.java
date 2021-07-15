package com.test.exception.demo;

public class ExceptionDemo {

	public static void main(String[] args) {

		ThrowExample obj = new ThrowExample();
		obj.display();

	}

}

class ThrowExample {
	int value = 100;

	public void display()  // this method having some critical code ,that should implement implement //
							// exception
	{
		if (value == 500) {

		} else if (value == 250) {

		} else if (value == 100) {
			System.out.println("Exception throw");
			try {
				throw new MyException("My Exception");
			} catch (Exception e) {
				e.printStackTrace();
			} // particular point i need to raise
		}
	}

}