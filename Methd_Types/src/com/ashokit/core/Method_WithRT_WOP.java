package com.ashokit.core;

public class Method_WithRT_WOP {
	public static void main(String[] args) {
		Method_WithRT_WOP m = new Method_WithRT_WOP();
		int x = m.add();
		System.out.println(x);
	}

	int add() {
		int a = 10;
		int b = 20;
		return a + b;
	}
}
