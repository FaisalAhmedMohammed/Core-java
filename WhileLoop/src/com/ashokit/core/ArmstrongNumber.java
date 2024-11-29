package com.ashokit.core;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		boolean flag = armstrong(n);
		if (flag == true) {
			System.out.println(n + ":is an armstrong number");
		} else {
			System.out.println(n + ":is not an armstrong number");
		}
	}

	private static boolean armstrong(int n) {
		// convert int into string
		String str = String.valueOf(n);
		int len = str.length();
		int temp = n;
		int sum = 0;
		int d;
		while (n != 0) {
			d = n % 10;
			sum = sum + (int) Math.pow(d, len);// power method returns result as double so we need to type cast it into
			// int
			n = n / 10;

		}
		if (sum == temp)
			return true;
		else
			return false;

	}

}
