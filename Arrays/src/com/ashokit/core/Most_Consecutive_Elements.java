package com.ashokit.core;

public class Most_Consecutive_Elements {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5 };

		int mostRepeated = arr[0];
		int maxCount = 1;
		int currentCount = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				currentCount++;
			} else {
				currentCount = 1;
			}

			if (currentCount > maxCount) {
				maxCount = currentCount;
				mostRepeated = arr[i];
			}
		}

		System.out
				.println("Most consecutively repeated element: " + mostRepeated + " (repeated " + maxCount + " times)");

	}
}
