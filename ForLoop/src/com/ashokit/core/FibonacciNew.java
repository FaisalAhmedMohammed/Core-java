package com.ashokit.core;

import java.util.Scanner;

public class FibonacciNew {
	public static void Fibonacci(int n) {
		int ft = 0;
		int st = 1;
		System.out.print(ft + "  " + st + "  ");
		for (int i = 3; i <= n; i++) {
			int nt = (ft + st);// 1
			System.out.print(nt + "  ");// 1
			ft = st;// 1
			st = nt;// 1

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		Fibonacci(n);

	}

}
