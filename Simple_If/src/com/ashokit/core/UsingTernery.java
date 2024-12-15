package com.ashokit.core;

public class UsingTernery {
	public static void main(String[] args) {
		int a = 10;
		String str = (a < 0) ? "negative" : (a > 0) ? "positive" : "zero";
		System.out.println(str);
	}

}
