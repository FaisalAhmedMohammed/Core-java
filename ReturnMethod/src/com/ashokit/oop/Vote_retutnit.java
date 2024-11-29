package com.ashokit.oop;

import java.util.Scanner;

public class Vote_retutnit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any number");
		int age = sc.nextInt();
		boolean flag = Eligable(age);
		if (flag == true) {
			System.out.println("you are eligable to vote");
		} else {
			System.out.println("you are not eligable to vote");
		}
	}

	private static boolean Eligable(int age) {
		if (age >= 18) {
			return true;
		} else {
			return false;

		}
	}

}
