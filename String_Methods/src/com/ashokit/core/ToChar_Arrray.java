/* it  is used to convert a string in to characters array*/
package com.ashokit.core;

public class ToChar_Arrray {
	public static void main(String[] args) {
		String name = "ashokit";
		char[] ch = convert(name);
		for (char c : ch) {
			System.out.print(c + " ");
		}
	}

	private static char[] convert(String name) {
		return name.toCharArray();
	}

}
