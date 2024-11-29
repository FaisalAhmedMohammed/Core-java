package com.ashokit.core;

import java.util.Scanner;

/* this program is to search for an specific element in array
 * */
public class Linear_Search_Element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleae enter size of array");
		int n = sc.nextInt();
		// create array
		int[] arr = new int[n];
		// insert element in array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("insert element at index " + i);
			arr[i] = sc.nextInt();
		}
		Search(arr);
	}

	private static void Search(int[] arr) {
		int number = 20;
		boolean flag = false;
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Elemet is found at index :" + arr[i]);
		} else {
			System.out.println("Search element is not foung");
		}

	}

}
