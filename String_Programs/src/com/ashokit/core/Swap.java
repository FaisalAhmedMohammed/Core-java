package com.ashokit.core;

import javax.swing.text.AbstractDocument.LeafElement;

public class Swap {
	public static void main(String[] args) {
		String firstname = "bhupen";
		String lname = "chachakar";
		find(firstname, lname);
	}

	private static void find(String firstname, String lname) {
		firstname = firstname + lname;// bhupenchachakar
		lname = firstname.substring(0, firstname.length() - lname.length());// bhupen
		firstname = firstname.substring(lname.length());
		System.out.println("firstname: " + firstname);
		System.out.println("lastname: " + lname);

	}

}
