package com.ashokit.core;

public class Search_Element {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 1, 4, 3, 1 };
		int search = 1;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (search == arr[i]) {
				count += 1;
			}
		}
		System.out.println(search + " Elemet found :" + +count + " Times");
	}

}
