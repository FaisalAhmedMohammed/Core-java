package com.ashokit.core;

public class Method_WOP_WRT {

	public static void main(String[] args) {
		Method_WOP_WRT m = new Method_WOP_WRT();// object creation
		int x = m.add();// method invocation nothing but calling
		System.out.println(x);
	}

	int add() {//
		int a = 10;
		int b = 20;
		return a + b;
	}
}
