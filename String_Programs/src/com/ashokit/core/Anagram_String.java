package com.ashokit.core;

import java.util.Arrays;

public class Anagram_String {
	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";
		int l = str1.length();
		int ll = str2.length();
		if (l != ll) {
			System.out.println("they are not anagrams");
			return;
		}
		anagram(str1, str2);
	}

	private static void anagram(String str1, String str2) {
		char[] ch = str1.toCharArray();
		char[] cc = str2.toCharArray();
		Arrays.sort(ch);// eilnst
		Arrays.sort(cc);// eilnst
		if (Arrays.equals(ch, cc)) {
			System.out.println("the given strings are anagram Strings");
		} else {
			System.out.println("not an anagram strings");
		}

	}

}
