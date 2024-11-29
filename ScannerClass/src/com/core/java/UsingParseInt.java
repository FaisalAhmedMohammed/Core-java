package com.core.java;

import java.util.Scanner;

public class UsingParseInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		String str = sc.nextLine();
		int empno = Integer.parseInt(str);
		System.out.println(empno);
	}

}
