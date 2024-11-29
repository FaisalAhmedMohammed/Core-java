package com.ashokit.core;

public class University_by_StaticMet {
	int id;
	String name;

	static University_by_StaticMet show(int id) {
		University_by_StaticMet u = new University_by_StaticMet();
		if (id == 101) {
			u.id = 101;
			u.name = "oxford";
		} else if (id == 102) {
			u.id = 101;
			u.name = "oxford";
		}
		return u;
	}

	String display() {
		String s = "faisal";
		return s;
	}

	public static void main(String[] args) {
		University_by_StaticMet s = University_by_StaticMet.show(101);
		System.out.println(s.id + " " + s.name);
		String dd = s.display();
		System.out.println(dd);
	}

}
