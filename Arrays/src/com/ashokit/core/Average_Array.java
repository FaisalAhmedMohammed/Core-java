package com.ashokit.core;

public class Average_Array {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		double average;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

		}
		average = (double) sum / arr.length;
		System.out.println(average);

	}

}
