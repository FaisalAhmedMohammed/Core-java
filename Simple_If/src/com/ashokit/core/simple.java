package com.ashokit.core;

import java.util.Scanner;

/*This program reads username and password as input and
 * check whether username is scott and password is tiger or not */
public class simple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter username");
		String username = sc.nextLine();
		System.out.println("Enter password");
		String password = sc.nextLine();
		if (username.equalsIgnoreCase("scott")) {
			if (password.equalsIgnoreCase("tiger")) {
				System.out.println("Login successfull");
			}
		} else {
			System.out.println("Login denied");
		}

	}

}
