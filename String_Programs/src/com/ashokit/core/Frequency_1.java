package com.ashokit.core;

public class Frequency_1 {
	public static void main(String[] args) {
		String name = "missisipi";
		frequency(name);
	}

	private static void frequency(String name) {
		String ss = "";
		for (int i = 0; i < name.length(); i++) {
			int count = 1;
			if (!ss.contains(name.charAt(i) + "")) {
				ss += name.charAt(i);
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
