package com.ashokit.core;

public class UsingTernery {
	public static void main(String[] args) {
		int a = 10;
		String str = (a < 0) ? "positive" : (a > 0) ? "negative" : "zero";
		System.out.println(str);
	}

}
