package com.test.inheritance.demo;


class Drawings implements CircleInterface, RectangleInterface {

	@Override
	public void drawRectangle(int size) {

		System.out.println("size of the Rectangle"+size);
		
	}

	@Override
	public void display() {

	}

	@Override
	public void drawCircle(int size) {

		size=size+100;
		System.out.println("size of the Circle in the Drawingclass----"+size);
		
	}






}

public class OverridingExample {
	public static void main(String[] args) {
		Drawings obj = new Drawings(); // direct object creation 
		obj.drawCircle(10);  //overriding
		obj.drawRectangle(20);
		
		CreateDiagram creatediagram=new CreateDiagram();
		creatediagram.drawCircle(10); //overridinng
	

	}

}
