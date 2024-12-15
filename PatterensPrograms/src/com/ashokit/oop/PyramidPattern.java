package com.ashokit.oop;

import java.util.Scanner;

/*       - - - - *  
 *       - - - * - *
 *       - - * - *- * 
 *       - * * - *- * *
 *       * * * * *  * *        */
public class PyramidPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any term");
		int n = sc.nextInt();
		Pattern(n);

	}

	private static void Pattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
