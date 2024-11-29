package com.ashokit.core;

import java.util.Scanner;

public class PracticePrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		Prime(n);
	}

	private static void Prime(int n) {
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}

		}
		if (count == 2) {
			System.out.println("it is prime");
		} else {
			System.out.println("it is not prime number");
		}

	}

}
