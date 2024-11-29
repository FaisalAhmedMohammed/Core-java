package com.ashokit.core;

public class Insert_Element_in_Array {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		// int[] arr = { 10, 20,25,30, 40, 50 };
		int position = 2;
		int element = 25;

		// creating new array with old array + 1;
		int[] newarr = new int[arr.length + 1];

		// copy the elements up to position in to new array
		for (int i = 0; i < position; i++) {
			newarr[i] = arr[i];
		}
		// insert element into new arrays position
		newarr[position] = element;

		// copy remaining elements into new array
		for (int i = position; i < arr.length; i++) {
			newarr[i + 1] = arr[i];
		}
		// print the elements
		for (int i = 0; i < newarr.length; i++) {
			System.out.print(newarr[i] + " ");
		}
	}

}
