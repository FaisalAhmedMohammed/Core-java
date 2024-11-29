package com.core.java;

import java.util.Scanner;

public class FahrenhitToCelsius1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fahrenhit value");
		double fahrenhit = sc.nextDouble();

		double celsius = (fahrenhit * 5 / 9) - 32;
		System.out.println(celsius);

	}

}
