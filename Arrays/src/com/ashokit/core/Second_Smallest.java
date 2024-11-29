package com.ashokit.core;

import java.util.Scanner;

public class Second_Smallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleae Enter size of an array");
		int n = sc.nextInt();
		// create array
		int[] arr = new int[5];
		// insert elemets in array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Insert Element at index = " + i);
			arr[i] = sc.nextInt();
		}
		Second(arr);
	}

	private static void Second(int[] arr) {
		int smallest = arr[0];
		int second_smallest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				second_smallest = smallest;
				smallest = arr[i];
			} else if (arr[i] != smallest && arr[i] > second_smallest) {
				second_smallest = arr[i];
			}
		}
		System.out.println("Second Smallest is :" + second_smallest);

	}

}
