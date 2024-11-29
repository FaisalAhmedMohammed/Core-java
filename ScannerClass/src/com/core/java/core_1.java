package com.core.java;

import java.util.Scanner;

public class core_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firset number");
		int x = sc.nextInt();
		System.out.println("Enter second number");
		int y = sc.nextInt();
		int z = x + y;
		System.out.println("sum of two numbers is:" + z);
	}

}