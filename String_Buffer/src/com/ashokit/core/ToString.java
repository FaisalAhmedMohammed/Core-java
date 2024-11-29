package com.ashokit.core;

/*toString method is used to convert object into string "javajvf";*/
public class ToString {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		String st1 = sb1.toString();
		String st2 = sb2.toString();
		System.out.println(st1 == st2);/*
										 * false because when we are converting Sb in to String toString method will
										 * create a new object.
										 */
		System.out.println(st1.equals(st2));// here content is checked
	}

}
