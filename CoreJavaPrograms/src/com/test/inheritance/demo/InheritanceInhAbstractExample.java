package com.test.inheritance.demo;

abstract class Circle { // we can have abstract method
	abstract void drawCircle();

	abstract void drawRectangls();

	void display() // instance method
	{
		System.out.println("this is the circle ");
	}
}
abstract  class Diagram extends Circle {   //partialy inheritance   

	@Override
	void drawCircle() {
		System.out.println("drawing circle");

	}

}


class NewDiagram extends Diagram
{

	@Override
	void drawRectangls() {
		System.out.println("draw recangle");
		
	}
	
}




public class InheritanceInhAbstractExample {
	public static void main(String[] args) {

	Circle obj = new NewDiagram();
		obj.drawCircle();
		obj.display();
		obj.drawRectangls();

	}
}
