package com.ashokit.core;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		reverse(n);
	}

	private static void reverse(int n) {
		int d;
		while (n != 0) {
			d = n % 10;
			System.out.print(d+" ");
			n = n / 10;
		}

	}

}
