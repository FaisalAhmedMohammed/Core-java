package com.ashokit.core;

import java.util.Scanner;

public class Swap {
	private static void Swap(int a, int b) {
		int temp;// 10 20
		
		temp = a;// 10
		a = b;// 20
		b = temp;// 10
		System.out.println(a + " " + b + " ");

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Swap(a, b);
	}

}
