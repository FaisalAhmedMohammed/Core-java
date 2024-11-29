package com.ashokit.core;

import java.util.Arrays;

public class Binary {
	public static void main(String[] args) {
		int[] arr = { 10, 12, 20, 34, 45, 37, 41, 50, 76 };
		boolean flag = Search(arr);
		if (flag == true) {
			System.out.println("Element found");
		} else {
			System.out.println("Element is not found");
		}
	}

	private static boolean Search(int[] arr) {
		Arrays.sort(arr);
		int k = 2;
		int low = 0;
		int high = arr.length - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (k == arr[mid]) {
				return true;
			} else if (k > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return false;
	}

}
