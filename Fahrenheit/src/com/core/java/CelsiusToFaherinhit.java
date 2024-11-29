package com.core.java;

import java.util.Scanner;

public class CelsiusToFaherinhit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter celsius value");
		float f = sc.nextFloat();

		float Fahrenheit = (f * 5 / 9) + 32;
		System.out.println(Fahrenheit);
	}

}
