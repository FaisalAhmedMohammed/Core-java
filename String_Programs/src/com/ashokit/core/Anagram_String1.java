package com.ashokit.core;

import java.util.Arrays;

public class Anagram_String1 {
	public static void main(String[] args) {
		String str1 = "test";
		String str2 = "ttse";
		int len1 = str1.length();
		int len2 = str2.length();
		if (len1 != len2) {
			System.out.println("they are not anagrams");
			return;
		}
		anagram(str1, str2);

	}

	private static void anagram(String str1, String str2) {
		char[] ch = str1.toCharArray();
		char[] cc = str2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(cc);
		boolean flag = true;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != cc[i]) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("given strings are anagram");
		} else {
			System.out.println("they are not anagram");
		}
	}

}
