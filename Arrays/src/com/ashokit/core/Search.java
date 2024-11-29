package com.ashokit.core;

public class Search {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int search = 3;
		boolean found = SearchElement(arr, search);
		if (found) {
			System.out.println("element ");
		} else {
			System.out.println("Element not found");
		}
	}

	private static boolean SearchElement(int[] arr, int search) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				flag = true;
				break;

			}

		}
		return flag;

	}
}
