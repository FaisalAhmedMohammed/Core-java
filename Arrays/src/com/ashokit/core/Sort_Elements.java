package com.ashokit.core;

//to sort the elements first we have to compare the first element with second elememt
//if first element is greater then second then swap them.
public class Sort_Elements {
	public static void main(String[] args) {
		int[] arr = { 15, 19, 7, 10, 28 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// print the elements
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
