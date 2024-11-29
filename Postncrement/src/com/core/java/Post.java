package com.core.java;

public class Post {
	public static void main(String[] args) {
		int a = 10;
		int b = a++;
//post increment :first use the a value assign it to b then increment by 1
		System.out.println(a);
		System.out.println(b);

		int p = 10;
		int q = --p;
//pre decrement :first decrement p value by 1 then assign it to q
		System.out.println(p);
		System.out.println(q);

	}

}
