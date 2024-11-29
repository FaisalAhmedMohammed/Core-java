package com.ashokit.core;

import java.util.Scanner;

public class FibboSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		Tofindfibbonacci(n);
	}

	private static void Tofindfibbonacci(int n) {
		int firstterm = 0;
		int sescondterm = 1;
		int nextterm;
		for (int i = 1; i <= n; i++) {
			System.out.println(firstterm);//0  1  1  2  3  5  8 13
 			nextterm = (firstterm + sescondterm);//1  2  3  5  8  13 21
			firstterm=sescondterm;//1  1  2  3   5  8  13
			sescondterm=nextterm;//1  2  3   5   8  13 21
		}
	}

}
