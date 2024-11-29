package com.ashokit.core;

import java.util.HashSet;
import java.util.Set;

public class Union_of_two_Array {
	public static void main(String[] args) {
		int[] arr1 = { 3, 2, 7, 0 };
		int[] arr2 = { 1, 3, 5, 7, 2, 8 };
		Union(arr1, arr2);
	}

	private static void Union(int[] arr1, int[] arr2) {
		Set<Integer> union = new HashSet<>();
		// adding array 1 into set nothing but union se
		for (int x : arr1) {
			union.add(x);
		}
		// taking array 2 and adding it to set
		for (int x : arr2) {
			union.add(x);
		}
		System.out.println(union);
	}

}
