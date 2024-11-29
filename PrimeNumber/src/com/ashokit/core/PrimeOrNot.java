package com.ashokit.core;

import java.util.Scanner;

public class PrimeOrNot {

	private static void Prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("prime number");
		} else {
			System.out.println("not a prime number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		Prime(n);

	}

}
