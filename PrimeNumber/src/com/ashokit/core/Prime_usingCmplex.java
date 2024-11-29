package com.ashokit.core;

import java.util.Scanner;

public class Prime_usingCmplex {
	private static void ToFindPrime(int n) {
		boolean isflag = true;
		if (n <= 1) {
			System.out.println("Not a Prime Number");
			return;
		}
		if (n == 2) {
			System.out.println("It is a Prime Number");
			return;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isflag = false;
				break;
			}
		}
		if (isflag == true) {
			System.out.println("It is a Prime Number");
		} else {
			System.out.println("Not a It is a Prime Number");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		ToFindPrime(n);
	}

}
