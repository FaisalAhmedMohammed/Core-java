package com.ashokit.core;

import java.util.Arrays;

public class Method_Warray_As_Parameter_WORT {
	public static void main(String[] args) {
		Method_Warray_As_Parameter_WORT a = new Method_Warray_As_Parameter_WORT();
		int[] ar = { 1, 2, 3, 4, 5 };

		a.add(ar);
	}

	void add(int[] arr) {
		System.out.println(Arrays.toString(arr));

	}

}
