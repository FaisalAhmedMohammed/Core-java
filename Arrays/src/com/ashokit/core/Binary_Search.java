package com.ashokit.core;

import java.util.Arrays;

public class Binary_Search {
	public static void main(String[] args) {
		int[] arr = { 10, 21, 43, 12, 17, 54, 34, 50 };
		int k = 12;
		boolean found = BinarySearch(arr, k);
		if (found) {
			System.out.println("Element is found");
		} else {
			System.out.println("Element is not found");
		}
	}

	private static boolean BinarySearch(int[] arr, int k) {
		Arrays.sort(arr);
		for (int a : arr) {
			System.out.println(a);
		}
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (k == arr[mid]) {
				return true;
			} else if (k < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return false;

	}

}
