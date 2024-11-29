package com.ashokit.oop;

public class Convert_Name_Returnit {
	public static void main(String[] args) {
		String name = "faisal";
		String print = Upper(name);
		System.out.println("convering the name into uppercase:" + print);
	}

	private static String Upper(String name) {
		return name.toUpperCase();
	}

}
