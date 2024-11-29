package com.ashokit.core;

public class Find_vowel_consonent {
	public static void main(String[] args) {
		String str = "CorE JavA@9AM";
		find(str);
	}

	private static void find(String st) {
		int vowelcount = 0;
		int consonent = 0;

		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				vowelcount++;
			} else if (!Character.isDigit(ch[i]) && ch[i] != '@' && ch[i] != '#' && ch[i] != '@' && ch[i] != '%'
					&& ch[i] != '&' && ch[i] != '*' && ch[i] != ' ') {
				consonent++;

			}

		}
		System.out.println("VowelsCount :" + vowelcount);
		System.out.println("ConsonentCount :" + consonent);

	}

}
