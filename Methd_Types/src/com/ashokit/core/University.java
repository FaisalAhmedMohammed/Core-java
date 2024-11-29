package com.ashokit.core;
public class University {
	int id;
	String name;
	University details(int id) {
		University u = new University();
		if (id == 101) {
			u.id = 101;
			u.name = "oxford";
		} else if (id == 102) {
			u.id = 102;
			u.name = "stanford";
		}
		return u;
	}
	public static void main(String[] args) {
		University u1 = new University();
		University dd = u1.details(101);
		System.out.println(dd.id + " " + dd.name);
	}
}