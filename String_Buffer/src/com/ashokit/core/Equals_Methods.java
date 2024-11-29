package com.ashokit.core;

public class Equals_Methods {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println(sb == sb2);
		System.out.println(sb.equals(sb2));// false because equals method is not overriden in StringBuffer clss
	}

}
 