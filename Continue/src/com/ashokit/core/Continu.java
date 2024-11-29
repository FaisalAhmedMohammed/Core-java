package com.ashokit.core;

import java.util.Scanner;

public class Continu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		while (true) {
			System.out.println("Enter positive number");
			int num = sc.nextInt();
			if (num < 0) {
				continue;
			}
			count = count + 1;
			sum = sum + num;
			if (count >= 5) {
				break;
			}
		}
		System.out.println("sum of  5 positive number is:" + sum);
	}
}
