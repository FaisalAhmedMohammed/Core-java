package com.ashokit.core;

import java.util.Scanner;

public class PerfectNumber {
	public static void FindPerfectNumber(int n) {
		if (n <= 1) {
			System.out.println("Not a Perfect Number");
			return;
		}
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				sum += i;
		}
		if (sum == n) {
			System.out.println(n+":it is a perfect Number");
		} else {
			System.out.println(n+":not a Perfect Number");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		FindPerfectNumber(n);
	}

}
