package com.ashokit.core;

public class Insert_Element {
	public static void main(String[] args) {
		int[] originalarray = { 10, 20, 30, 40, 50 };
		int position = 2;
		int value = 25;
		int[] newarray = new int[originalarray.length + 1];
		for (int i = 0; i < position; i++) {
			newarray[i] = originalarray[i];
		}
		newarray[position] = value;// 12,20,25,

		for (int i = position; i < originalarray.length; i++) {
			newarray[i + 1] = originalarray[i];

		}
		System.out.println("Elemets after inserted");
		for (int i = 0; i < newarray.length; i++) {
			System.out.print(newarray[i]+" ");
		}

	}

}
