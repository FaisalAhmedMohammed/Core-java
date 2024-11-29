package com.apna.co;

import java.util.Scanner;

public class Print_Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + i * n);
		}
		System.out.println("=".repeat(40));
		int i = 0;
		while (i < 10) {
			i++;
			System.out.println(n + "*" + i + "=" + n * i);
		}
	}

}
