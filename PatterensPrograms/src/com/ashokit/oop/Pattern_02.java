package com.ashokit.oop;

  /*    
        * * * * *
        * * * *
        * * *
        * *
        *  
*/
import java.util.Scanner;

public class Pattern_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		Pattern(n);
	}

	private static void Pattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*" + " ");

			}
			System.out.println();
		}

	}

}
