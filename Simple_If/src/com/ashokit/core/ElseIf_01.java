package com.ashokit.core;

import java.util.Scanner;

/*
 * This program is for the following
 * If a given number is divisible by 3 then display "Zip"
 * If a given number is divisible by 5 then display "Zap"
 * If a given number is divisible by 3 and 5 then display "Hurray"
 * Otherwise, display "Done"
 * here we have to take input as 15.
 */

public class ElseIf_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if (a % 3 == 0 && a % 5 == 0) {
			System.out.println("Huray");
		} else if (a % 3 == 0) {
			System.out.println("zip");
		} else if (a % 5 == 0) {
			System.out.println("zap");
		} else {
			System.out.println("other");
		}
	
	}

}
