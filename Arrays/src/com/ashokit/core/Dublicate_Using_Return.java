package com.ashokit.core;

import java.util.Arrays;

/*we can assign null to reference type but not to the primitive type
 * array is an reference type.if we assign and execute we will get
 * null pointer exception */
public class Dublicate_Using_Return {
	public static void main(String[] args) {
		// int[] arr = { 1, 2, 2, 3, 1, 3, 4, 5 };
		int[] arr = { 1 };
		Duplicat(arr);
	}

	private static void Duplicat(int[] arr) {
		if (arr == null || arr.length == 0) {
			System.out.println("array is null or empty||");

			return;/* return is used to terminate the method here method is Duplicate */
		}
		if (arr.length == 1) {
			System.out.println("Array has only one element:" + arr[0]);
			return;
		}

		Arrays.sort(arr);
		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		for (int k = 0; k <= i; k++) { 
			System.out.println(arr[k]);
		}

	}

}
