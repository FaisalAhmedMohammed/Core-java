package com.ashokit.core;

import java.util.Scanner;

public class SquaareRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		square(n);
	}

	private static void square(int n) {
		// here we don't need any while loop because we are using math.sqrt method

		int m = (int) Math.sqrt(n);
		System.out.println("square root of " + n + " is :" + m);

	}

}
