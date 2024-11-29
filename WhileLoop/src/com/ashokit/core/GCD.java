package com.ashokit.core;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		int gcd = findGCD(n1, n2);
		System.out.println(gcd);
		int lcm = findLCM(n1, n2, gcd);
		System.out.println(lcm);
	}

	private static int findLCM(int n1, int n2, int gcd) {
		return n1 * n2 / gcd;
	}

	private static int findGCD(int num1, int num2) {
		int temp;
		while (num2 != 0) {
			temp = num1 % num2;
			num1 = num2;
			num2 = temp;

		}
		return num1;

	}

}
