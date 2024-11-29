package com.ashokit.core;

public class Copy_Elements_To_Amother {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] copy = arr.clone();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(copy[i] + " ");
		}
		/*
		 * for(int i=0;i<arr.length;i++)
		 * { copy[i]=arr[i]; 
		 * }
		 */

	}

}
