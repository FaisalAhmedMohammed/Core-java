package com.ashokit.core;

public class Dummy {
	sports details() {
		sports s = new sports();
		s.id = 101;
		s.name = "ashok";
		s.age = 30;
		return s;

	}

	public static void main(String[] args) {
		Dummy d = new Dummy();
		sports dee = d.details();
		System.out.println(dee.id + " " + dee.name + " " + dee.age);
	}
}

class sports {
	int id;
	String name;
	int age;
}
