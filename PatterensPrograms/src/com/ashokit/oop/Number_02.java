package com.ashokit.oop;

/*     1
 *     1 2
 *     1 2 3
 *     1 2 3 4
 *     1 2 3 4 5     */
import java.util.Scanner;

public class Number_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = sc.nextInt();
		Number(n);
	}

	private static void Number(int n) {
		int count = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}

}
