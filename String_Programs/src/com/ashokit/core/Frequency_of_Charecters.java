package com.ashokit.core;

import java.util.Arrays;

public class Frequency_of_Charecters {
	public static void main(String[] args) {
		String name = "missisipi";

		frequency(name);
	}

	private static void frequency(String name) {
		String st = "";
		for (int i = 0; i < name.length(); i++) {
			int count = 1;
			if (!st.contains(name.charAt(i) + "")) {
				st += name.charAt(i);
				for (int j = i + 1; j < name.length(); j++) {
					if (name.charAt(i) == name.charAt(j)) {
						count++;
					}
				}

				System.out.println(name.charAt(i) + "=" + count);
			}
		}
	}

}
