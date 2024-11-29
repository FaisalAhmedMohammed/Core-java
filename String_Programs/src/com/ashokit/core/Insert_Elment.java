package com.ashokit.core;

public class Insert_Elment {
	public static void main(String[] args) {
		String str = "java a language";//
		String insertElement = "is ";
		int index = 5;
		String newstr = str.substring(0, index);
		// System.out.println(newstr);
		newstr += insertElement;
		// System.out.println(newstr);
		newstr += str.substring(index);
		System.out.println( newstr);

	}

}
