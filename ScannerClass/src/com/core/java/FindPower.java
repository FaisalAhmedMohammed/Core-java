package com.core.java;

import java.util.Scanner;

public class FindPower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entere first numner");
		int x = sc.nextInt();
		System.out.println("Enter second number");
		int y = sc.nextInt();
		double z = Math.pow(x, y);
		System.out.println(z);

	}

}
