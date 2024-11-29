package com.ashokit.core;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		spy(n);

	}

	private static void spy(int n) {
		int temp = n;
		int sum = 0;
		int prod = 1;
		int d;
		while (n != 0) {
			d = n % 10;
			sum += d;
			prod *= d;
			n = n / 10;

		}
		if (sum == prod) {
			System.out.println("it is spy number");
		} else {
			System.out.println("not a spy number");
		}

	}

}
