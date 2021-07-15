package com.test.inheritance.demo;

class CreateDiagram implements CircleInterface, RectangleInterface {

	@Override
	public void display() {

	}

	@Override
	public void drawRectangle(int size) {

		System.out.println("size of the Rectangle" + size);
	}

	@Override
	public void drawCircle(int size)throws NullPointerException  {

		System.out.println("size of the Circle in CreateDiagram" + size);

	}

}

public class InheritanceInterfaceDemo {
	public static void main(String[] args) {
		CreateDiagram obj = new CreateDiagram(); // direct object creation

		try {
			obj.drawCircle(12);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.drawRectangle(20);

	}

}





