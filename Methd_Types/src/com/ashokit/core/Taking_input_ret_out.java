package com.ashokit.core;

public class Taking_input_ret_out {

	persom print(int id) {
		persom p = new persom();
		if (id == 101) {
			p.id = 101;
			p.name = "raju";
			p.age = 24;

		} else {
			if (id == 102) {
				p.id = 102;
				p.name = "rani";
				p.age = 40;
			} else {
				System.out.println("please enter vaild id");
			}
		}
		return p;
	}

	public static void main(String[] args) {
		Taking_input_ret_out t = new Taking_input_ret_out();
		persom print = t.print(103);
		System.out.println(print.id + " " + print.name + " " + print.age);

	}

}

class persom {
	int id;
	String name;
	int age;

}