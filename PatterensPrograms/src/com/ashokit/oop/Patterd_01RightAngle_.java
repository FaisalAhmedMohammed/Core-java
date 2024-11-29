package com.ashokit.oop;

import java.util.Scanner;

public class Patterd_01RightAngle_ {
	public static void Pattern(int n) {
		for (int i = 0; i < n; i++) {
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
