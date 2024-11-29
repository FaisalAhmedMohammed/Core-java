package com.ashokit.core;

import java.util.Scanner;

public class UsingThreeNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Enter third numner");
		int c = sc.nextInt();

		int d = (a > b && a > c) ? a : (b > c) ? b : c;
		System.out.println("Greatest of three number is:" + d);
	}
}
