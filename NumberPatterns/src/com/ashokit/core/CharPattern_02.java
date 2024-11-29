package com.ashokit.core;

public class CharPattern_02 {
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (char ch = 'A'; ch <= 'A' + i; ch++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

}
