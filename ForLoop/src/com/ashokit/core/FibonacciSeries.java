package com.ashokit.core;

import java.util.Scanner;

public class FibonacciSeries {
	private static void fibonacci(int term) {
		int firstterm = 0;
		int secondterm = 1;
		int nextterm;
		for (int i = 1; i <= term; i++) {
			System.out.print(firstterm+" ");// 0 1 1 2 3 5
			nextterm = (firstterm + secondterm);// 1 2 3 5 8  13
			firstterm = secondterm;// 1 1 2 3 5  8
			secondterm = nextterm;// 1 2 3 5 8   13
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any term");
		int term = sc.nextInt();
		fibonacci(term);
	}

}
