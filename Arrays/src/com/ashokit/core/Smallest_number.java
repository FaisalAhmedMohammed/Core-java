package com.ashokit.core;

import java.util.Scanner;

public class Smallest_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plese Enter the size of array");
		int n = sc.nextInt();
		// create array
		int[] arr = new int[n];
		// insert the elements in array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("insert element at index = " + i);
			arr[i] = sc.nextInt();
		}
		Smallest(arr);
	}

	private static void Smallest(int[] arr) {
		int smallest = arr[0];
		int second = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				second = smallest;
				smallest = arr[i];
			} else if (arr[i] != smallest && arr[i] > second) {
				second = arr[i];
			}
		}
		System.out.println("Smallest Number is :" + smallest);

	}

}
