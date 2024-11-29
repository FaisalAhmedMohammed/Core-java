package com.ashokit.core;

public class Inset_Using_String_In_Buffer {
	public static void main(String[] args) {
		String str = "java a language";
		StringBuffer sb = new StringBuffer(str);
		sb.insert(4, " is");
		System.out.println(sb);
	}

}
