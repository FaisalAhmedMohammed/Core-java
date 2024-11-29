package com.ashokit.core;

/*this method is used to remove the wide spaces before the  first character
 * and after the last character but not in between*/
public class Trim {
	public static void main(String[] args) {
		String name = "    ashok    it  ";
		String a = remove(name);
		System.out.println(a);
	}

	private static String remove(String n) {
		return n.trim();
	}
	

}
