package com.ashokit.core;

import java.util.Scanner;

public class Second_Largest_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of an array");
		int n = sc.nextInt();
		// Create the array
		int[] arr = new int[n];
		// Insert the elements in array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("insert element at array index " + i);
			arr[i] = sc.nextInt();
		}
		Largest(arr);

	}

	private static void Largest(int[] arr) {

		int large = arr[0];
		int second_large = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > large) {
				second_large = large;
				large = arr[i];
			} else if (arr[i] != large && arr[i] > second_large) {
				second_large = arr[i];
			}
		}

		System.out.println("SECOND LARGEST ELEMENT OF THE ARRAY IS : " + second_large);

	}

}
