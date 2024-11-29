package com.ashokit.oop;

/*      * * * * *
        * * * *
        * * *
        * *
        *  
*/
import java.util.Scanner;

public class Pattern_02_NewLogic {
	public static void Pattern(int n) {
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		Pattern(n);
	}

}
