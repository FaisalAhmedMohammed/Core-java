package com.ashokit.core;

public class Default_Array {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[2] = 20;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		char[] ch = new char[5];
		ch[0] = 'a';
		ch[2] = 'p';
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}

	}

}
