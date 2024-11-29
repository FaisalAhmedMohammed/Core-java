package com.ashokit.core;

import java.util.Scanner;

public class PracticePrime1 {
	public static void Prime(int n) {
		boolean isprime = true;
		if (n <= 1) {
			System.out.println("not a prime number");
			return;
		}
		if (n == 2) {
			System.out.println("it is a prime number");
			return;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isprime = false;
				break;
			}
		}
		if (isprime == true) {
			System.out.println("it is prime number");
		} else {
			System.out.println("not a prime number");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		Prime(n);
	}

}
