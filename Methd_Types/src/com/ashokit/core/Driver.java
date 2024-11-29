package com.ashokit.core;

public class Driver {
	public static void main(String[] args) {
		Driver d = new Driver();
		Employee ee = new Employee();
		ee.id = 100;
		ee.salary = 3000.0;
		d.print(ee);

	}

	void print(Employee e) {
		System.out.println(e.id + " " + e.salary);

	}

}

class Employee {
	int id;
	double salary;
}
