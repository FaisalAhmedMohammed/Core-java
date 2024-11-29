package com.ashokit.core;

import java.util.Arrays;

public class UsingArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		UsingArray u = new UsingArray();
		String s = u.m1(arr);
		System.out.println(s);
	}

	String m1(int[] arr) {
		return Arrays.toString(arr);
	}

}
