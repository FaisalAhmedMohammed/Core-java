package com.ashokit.core;

public class PrintEvenNumbers {
	public static void main(String[] args) {
		for (int i = 2; i <= 50; i += 2) {
			System.out.println(i);
		}
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
