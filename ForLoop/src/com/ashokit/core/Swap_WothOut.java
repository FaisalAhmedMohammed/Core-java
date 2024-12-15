package com.ashokit.core;

import java.util.Scanner;

public class Swap_WothOut {
	public static void Swap(int a, int b) {
		a = a + b;//10 + 20 = 30
		b = a - b;// 30 - 20 = 10
		a = a - b;//30 - 10 = 20
		System.out.println(a + " " + b + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Swap(a, b);

	}

}
