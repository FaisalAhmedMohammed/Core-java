package com.ashokit.core;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		boolean flag = true;
		int sqrt = (int) Math.sqrt(n);
		prime(n, flag, sqrt);
	}

	private static void prime(int n, boolean flag, int sqrt) {
		if (n <= 0) {
			System.out.println("not a prime number");
			return;
		}
		if (n == 2) {
			System.out.println(" it is prime number");
		}
		for (int i = 2; i < sqrt; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}

		}
		if (flag == true) {
			System.out.println("it is prime number");
		} else {
			System.out.println("it is not a prime");
		}

	}
}