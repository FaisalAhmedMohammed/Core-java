package com.ashokit.core;

public class First_Non_Repeating_Char {
	public static void main(String[] args) {
		String name = "boobbyo";
		repeating(name);
	}

	private static void repeating(String name) {

		for (int i = 0; i < name.length(); i++) {
			boolean flag = true;
			for (int j = 0; j < name.length(); j++) {
				if (i!=j && name.charAt(i) == name.charAt(j)) {
					flag = false;
					break;

				}
			}
			if (flag) {
				System.out.println(name.charAt(i));
				break;

			}

		}
	}

}
