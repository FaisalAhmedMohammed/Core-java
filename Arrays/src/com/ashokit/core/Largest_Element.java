package com.ashokit.core;

import java.util.Scanner;

public class Largest_Element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plese Enter size of an array");
		int n = sc.nextInt();
		// create the array
		int[] arr = new int[n];
		// insert the element in array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Insert element at insex =" + i);
			arr[i] = sc.nextInt();
		}
		Largest(arr);
	}

	private static void Largest(int[] arr) {
		int large = arr[0];
		int second = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > large) {
				second = large;
				large = arr[i];
			} else if (arr[i] != large && arr[i] > second) {
				second = arr[i];
			}
		}
		System.out.println("Largest number is:" + large);

	}

}
