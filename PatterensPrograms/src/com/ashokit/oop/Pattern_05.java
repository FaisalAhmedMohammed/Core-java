package com.ashokit.oop;

import java.util.Scanner;

/* A
   A B
   A B C
   A B C D
   A B C D E  */
public class Pattern_05 {
	public static void Pattern(int n) {
		for (int i = 0; i < n; i++) {// 1
			for (char ch = 'A'; ch <= 'A' + i; ch++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = sc.nextInt();
		Pattern(n);
	}

}
