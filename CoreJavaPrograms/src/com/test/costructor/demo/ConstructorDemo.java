package com.test.costructor.demo;

import com.test.string.demo.Employee;

public class ConstructorDemo {

	public static void main(String[] args) {

		Employee empObj = new Employee(101, "test", "10000");
		empObj.setAddress("Mumbai");

		// save
		System.out.println(empObj.getId() + empObj.getName() + empObj.getAddress() + empObj.getSalary());

		Employee empnewObj = updateAddress(empObj);
		System.out.println("New----" + empnewObj.getId() + empnewObj.getAddress());

	}

	public static Employee updateAddress(Employee emp) {
		emp = new Employee(101, "test111", "20000");
		emp.setAddress("Pune");

		return emp;

	}

}
