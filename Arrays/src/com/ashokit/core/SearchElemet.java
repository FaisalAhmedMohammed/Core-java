package com.ashokit.core;

public class SearchElemet {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 50, 40, 50 };
		int count = 0;
		int searchElement = 50;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchElement) {
				count++;
			}
		}
		System.out.println("Element is fount at " + count + " :times");
	}

}
