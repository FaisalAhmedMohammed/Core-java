package com.ashokit.core;

import java.util.Scanner;

/*
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 
*/
public class Number_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = sc.nextInt();
		Number(n);
	}

	private static void Number(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
