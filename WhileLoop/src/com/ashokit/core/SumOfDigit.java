package com.ashokit.core;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter any number");
		int n = sc.nextInt();
		int result = SumofDigit(n);
		System.out.println("Sum of digit is:"+result);
	}

	private static int SumofDigit(int n) {
		int sum = 0;
		int d;
		while (n != 0) {
			d = n % 10;
			sum += d;
			n = n / 10;

		}
		return sum;

	}

}
