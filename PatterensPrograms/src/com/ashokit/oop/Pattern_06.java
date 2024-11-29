package com.ashokit.oop;

import java.util.Scanner;

/*     A B C D E
       A B C D
       A B C
       A B
       A    */
public class Pattern_06 {
	public static void Pattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int ch = 'A'; ch > i; ch--) {
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
