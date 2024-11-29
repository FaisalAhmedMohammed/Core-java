package com.ashokit.core;

import java.util.Arrays;

public class Met_return_3object {
	int id;
	String name;

	@Override
	public String toString() {
		return "Met_return_3object [id=" + id + ", name=" + name + "]";
	}

	Met_return_3object[] details() {// method which return three objects
		Met_return_3object m = new Met_return_3object();
		m.id = 11;
		m.name = "ashok";

		Met_return_3object m1 = new Met_return_3object();
		m1.id = 12;
		m1.name = "nivas";

		Met_return_3object m2 = new Met_return_3object();
		m2.id = 13;
		m2.name = "ravi";
		Met_return_3object[] arr = { m, m1, m2 };
		return arr;
	}

	public static void main(String[] args) {
		Met_return_3object md = new Met_return_3object();
		Met_return_3object[] details = md.details();
		/*
		 * for (Met_return_3object x : details) { System.out.println(x.id + " " +
		 * x.name); }
		 */
		String string = Arrays.toString(details);
		System.out.println(string);
	}

}
