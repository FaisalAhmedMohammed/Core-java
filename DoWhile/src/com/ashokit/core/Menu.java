package com.ashokit.core;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			menu();
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			if (choice >= 5) {
				break;
			} else {
				System.out.println("Enter first number");
				int num1 = sc.nextInt();
				System.out.println("Enter second number");
				int num2 = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Addition : " + (num1 + num2));// if we don't in parenthesis then the output will
																		// be 1020
					break;
				case 2:
					System.out.println("Subtraction" + (num1 - num2));
					break;
				case 3:
					System.out.println("Multiplication" + (num1 * num2));
					break;
				case 4:
					System.out.println("Division" + (num1 / num2));
					break;
				}

			}

		} while (true);// infinite loop
	}

	private static void menu() {
		System.out.println("1.Additon");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("3.Divide");
		System.out.println("4.Exit");

	}

}
