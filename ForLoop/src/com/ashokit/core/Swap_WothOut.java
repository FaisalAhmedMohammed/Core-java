package com.ashokit.core;

import java.util.Scanner;

public class Swap_WothOut {
	public static void Swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
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
