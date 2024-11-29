package com.ashokit.core;

import java.util.Arrays;

public class Remove_Duplicate {
	public static void main(String[] args) {
		int[] arr = { 2, 1, 3, 4, 2, 1, 2, 4, 5 };
		removeduplicat(arr);
	}

	private static void removeduplicat(int[] arr) {
		Arrays.sort(arr);
		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];

			}

		}
		for (int k = 0; k <= i; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
