package com.ashokit.core;

public class Take_2_input {
	int id;
	String name;

	void details(Take_2_input p1, Take_2_input p2) {
		System.out.println(p1.id + " " + p1.name);
		System.out.println(p2.id + " " + p2.name);

	}

	public static void main(String[] args) {
		Take_2_input p = new Take_2_input();
		Take_2_input p3 = new Take_2_input();
		p3.id = 111;
		p3.name = "vikas";

		Take_2_input p4 = new Take_2_input();

		p4.id = 222;
		p3.name = "ramesh";
		p.details(p3, p4);
		p3.details(p3, p4);
		p4.details(p3, p4);

	}
}