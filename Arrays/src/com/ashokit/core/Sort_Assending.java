package com.ashokit.core;

import java.util.Arrays;

public class Sort_Assending {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 5, 2, 4 };
		Arrays.sort(arr);

		// to access the elements and to display the elements loop is required
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
