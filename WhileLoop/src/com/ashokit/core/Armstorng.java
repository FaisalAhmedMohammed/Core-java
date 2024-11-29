package com.ashokit.core;

import java.util.Scanner;

public class Armstorng {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		boolean flag = armstrong(n);
		if(flag==true) {
			System.out.println("it is an armstrong number");
		}
		else {
			System.out.println("not an armstrong numberF");
		}
	}

	private static boolean armstrong(int n) {
		// conver int into string
		String str = String.valueOf(n);
		// find the length
		int len = str.length();
		int temp = n;
		int sum = 0;
		int d;
		while (n != 0) {
			d = n % 10;
			sum = sum + (int) Math.pow(d, len);
			n = n / 10;

		}
		if(sum==temp) {
			return true;
		}
		else
		return false;
	}

}
