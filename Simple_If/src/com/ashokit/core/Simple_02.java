package com.ashokit.core;

import java.util.Scanner;

public class Simple_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		// to divide second number with first number first we have to check
		// whether the first number is greater than first number or not
		if (a >= b) {
			if (a % b == 0) {
				System.out.println("second number divides first number");
			} else {
				System.out.println("second number connot divides first number");
			}
		} else {
			System.out.println("a is not greater than b");
		}
	}

}
