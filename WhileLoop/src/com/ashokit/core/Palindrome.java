package com.ashokit.core;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean flag = palindrome(n);
		if (flag == true) {
			System.out.println(n + " is a palindrome number");
		} else {
			System.out.println(n + " it is not an palindrome number");
		}
	}

	private static boolean palindrome(int n) {
		int temp = n;
		int reverse = 0;
		int d;
		while (n != 0) {
			d = n % 10;
			reverse = reverse * 10 + d;
			n = n / 10;

		}
		if (temp == reverse) {
			return true;
		} else
			return false;
	}

}
