package com.ashokit.core;

public class Reversr_String_StringBuffer_Compare {
	public static void main(String[] args) {
		String str = "ahmed";
		StringBuffer sb = new StringBuffer("");
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb);
	}
}