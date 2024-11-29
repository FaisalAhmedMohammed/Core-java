package com.ashokit.core;

public class SolidRectangle_Pattern {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// it improves the performance of the code
		System.out.println("=".repeat(0));
		int row = 5;
		int column = 5;
		for (int i = 1; i <= row; i++) {
			String str = "*".repeat(column);
			System.out.println(str);
		}
	}

}
