package com.ashokit.oop;

public class ReturnMethod {
	public static void main(String[] args) {
		int[] marks = { 10, 20, 30, 40 };
		int m[] = returnarray(marks);
		for (int k : m) {
			System.out.println(k);
		}
	}

	private static int[] returnarray(int[] marks) {
		return marks;
	}

}
