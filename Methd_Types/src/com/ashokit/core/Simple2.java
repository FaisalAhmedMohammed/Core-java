package com.ashokit.core;

import java.util.Arrays;

public class Simple2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		Simple2 s = new Simple2();
		String ss = s.rev(arr);
		System.out.println(ss);

		s.rev("ashok");

	}

	String rev(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;

		}

		return Arrays.toString(arr);

	}

	void rev(String name) {
		StringBuffer sb = new StringBuffer(name);
		sb.reverse();
		System.out.println(sb);
	}

}
