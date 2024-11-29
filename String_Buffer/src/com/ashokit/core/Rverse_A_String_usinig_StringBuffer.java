package com.ashokit.core;

/*Q) Reverse a String 
 * A)First create a String and then Convert that String into StringBuffer then use reverse()method*/
public class Rverse_A_String_usinig_StringBuffer {
	public static void main(String[] args) {
		String str = "hello";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}

}
