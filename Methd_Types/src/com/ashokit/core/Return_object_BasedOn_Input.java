package com.ashokit.core;

public class Return_object_BasedOn_Input {
	public static void main(String[] args) {
		Return_object_BasedOn_Input i = new Return_object_BasedOn_Input();
		players d = i.datails(18);
		System.out.println(d.id + " " + d.name + " " + d.age);
	}
	players datails(int id) {
		players p = new players();
		if (id == 7) {
			p.id = 7;
			p.name = "dhoni";
			p.age = 43;
		} else if (id == 18) {
			p.id = 18;
			p.name = "kholi";
			p.age = 38;
		} else if (id == 45) {
			p.id = 45;
			p.name = "rohit";
			p.age = 39;
		}

		return p;
	}
}
class players {
	int id;
	String name;
	int age;
}
