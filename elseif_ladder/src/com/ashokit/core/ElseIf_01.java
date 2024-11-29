package com.ashokit.core;

/* if the first condition is true then first condition statement is executed
 * and it doesn't check reamining conditions 
 * if the condition is false the condition is checkd and that statement is
 * execute */
public class ElseIf_01 {
	public static void main(String[] args) {
		int i = 10;

		if (i == 10) {
			System.out.println("hello");
		} else if (i == 30) {
			System.out.println("hi");
		} else if (i == 40) {
			System.out.println("hi hello");
		} else {
			System.out.println("Not euqal");
		}
		System.out.println("else if ladder");
	}

}
