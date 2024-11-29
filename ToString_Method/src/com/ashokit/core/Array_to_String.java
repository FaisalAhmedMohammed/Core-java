package com.ashokit.core;

/*here we are converting array to string using Arrays.tostring()method */
import java.util.Arrays;

public class Array_to_String {
	public static void main(String[] args) {
		String name = "ashokit";
		char[] arr = name.toCharArray();
		System.out.println(Arrays.toString(arr));
	}

}
