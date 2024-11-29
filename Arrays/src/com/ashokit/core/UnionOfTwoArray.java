package com.ashokit.core;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArray {
	public static void main(String[] args) {
		int[] arr1 = { 3, 5, 3, 7, 0 };
		int[] arr2 = { 1, 0, 5, 4, 6, 8 };
		Union(arr1, arr2);
	}

	private static void Union(int[] arr1, int[] arr2) {
//creating set object
		Set<Integer> union = new HashSet<>();
		// adding array1 elements to union nothing but set
		for (int i = 0; i < arr1.length; i++) {
			union.add(arr1[i]);
		}
		// adding array2 element to set
		for (int i = 0; i < arr2.length; i++) {
			union.add(arr2[i]);
		}
		// creating array 3
		int j = 0;
		int[] arr3 = new int[union.size()];
		for (int x : union) {
			arr3[j] = x;
			j++;
		}
		for (int num : arr3) {
			System.out.print( num+" ");
		}

	}

}
