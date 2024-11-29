package com.ashokit.core;

import java.util.Scanner;

public class Nested_01 {
	public static void main(String[] args) {
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("Enter weight ");
		int weight = sc.nextInt();
		if (age >= 18) {
			if (weight >= 50) {
				System.out.println("Your eligable to vote");
			} else {
				System.out.println("Your not eligable to vote ");
			}
		}
		System.out.println("hello");
	}
}
