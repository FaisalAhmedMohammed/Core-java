package com.ashokit.core;

public class ContinueNew {
	public static void main(String[] args) {
		for (int i = 1; i <= 15; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
