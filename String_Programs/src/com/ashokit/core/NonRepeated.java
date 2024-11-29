package com.ashokit.core;

public class NonRepeated {
	public static void main(String[] args) {
		String name = "sasidhar";
		non(name);
	}

	private static void non(String name) {

		for (int i = 0; i < name.length(); i++) {// java
			boolean flag = true;
			for (int j = 0; j < name.length(); j++) {
				if (i != j && name.charAt(i) == name.charAt(j)) {
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
