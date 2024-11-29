package com.ashokit.core;

import java.util.Arrays;

public class Metod_Array_WithOut_Return {
	public static void main(String[] args) {
		Metod_Array_WithOut_Return m = new Metod_Array_WithOut_Return();
		int[] arr = { 1, 2, 3, 4, 5 };
		m.display(arr);
	}

	void display(int[] arr) {
		String str = Arrays.toString(arr);
		System.out.println(str);

	}

}
