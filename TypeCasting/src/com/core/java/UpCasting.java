package com.core.java;

public class UpCasting {
	public static void main(String[] args) {
		byte a = 127;
		short s = a;
		System.out.println(s);

		short s1 = 32767;
		int ss = s1;
		System.out.println(ss);

		int i = 32767;
		long l = i;
		System.out.println(i);

		long l1 = 7654378L;
		float ff = l1;
		System.out.println(ff);

		float f = 468344f;
		double d = f;
		System.out.println(d);

		char ch = 'a';
		int xx = ch;
		System.out.println(xx);

		char ch3 = 'Z';
		long l2 = ch3;
		System.out.println(l2);

		char cc = 'A';
		float f1 = cc;
		System.out.println(f1);

		char ch2 = 'z';
		double dd = ch2;
		System.out.println(dd);

	}

}
