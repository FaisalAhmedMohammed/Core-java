package com.ashokit.core;

public class Delete_Element_In_ {
	public static void main(String[] args) {
		int[] originalarray = { 10, 20, 30, 40, 50 };
		int position = 2;

		int[] newarray = new int[originalarray.length - 1];

		for (int i = 0; i < position; i++) {
			newarray[i] = originalarray[i];// 10,20
		}
		for (int i = position; i < originalarray.length - 1; i++) {
			newarray[i] = originalarray[i + 1];
		}
		System.out.println("Elements after deletion");
		for (int i = 0; i < newarray.length; i++) {
			System.out.println(newarray[i]);
		}

	}

}
