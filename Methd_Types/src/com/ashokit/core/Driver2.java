package com.ashokit.core;

public class Driver2 {

	void print(Doctor d) {/*
							 * The parameter d will receive the doctor object passed from the main method.
							 * java
							 */

	}

	public static void main(String[] args) {
		Driver2 dd = new Driver2();
		Doctor d1 = new Doctor();
		d1.dage = 50;
		d1.dname = "ramchader";
		dd.print(d1);
	}
}

class Doctor {
	int dage;
	String dname;

}
