package com.ashokit.core;

import java.util.Scanner;

public class Even_Odd_Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the size of an array");
		int n = sc.nextInt();
		// first take the size the create the array
		int[] arr = new int[n];

		// Then insert the elements in array
		for (int i = 0; i < n; i++) {// 11 24 9 14 20
			System.out.println("insert element at array index " + i);
			arr[i] = sc.nextInt();
		}
		findEvenodd(arr);

	}

	private static void findEvenodd(int[] arr) {
		int evensum = 0;
		int oddsum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evensum += arr[i];
			} else {
				oddsum += arr[i];
			}
		}
		System.out.println("Evensum =" + evensum);
		System.out.println("oddsum =" + oddsum);
	}

}
