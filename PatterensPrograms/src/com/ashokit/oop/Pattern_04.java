package com.ashokit.oop;

/*   1
 *   2 3
 *   4 5 6
 *   7 8 9 10
 *   11 12 13 14 15
 *   */
import java.util.Scanner;

public class Pattern_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = sc.nextInt();
		Pattern(n);
	}

	private static void Pattern(int n) {
		int count = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}

}
