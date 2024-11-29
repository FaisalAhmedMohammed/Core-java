package com.ashokit.core;

/* increment and decrement operators are applicable to only variable but not for values
 * we will get compile time error */
public class Incement_01 {
	public static void main(String[] args) {
		int x = 'a';
		x++;
		System.out.println(x);

		double d = 10.5;
		d++;
		System.out.println(d);

		byte b = 10;
		b++;
		System.out.println(b);

		byte a = 10;
		byte b1 = 20;
		byte c = (byte) (a + b1);
		System.out.println(c);
		System.out.println("hello");
		byte e = 10;
		e = (byte) (e + 1);
		System.out.println(e);

		System.out.println('a' + 'b');

		System.out.println("====================");
		System.out.println('a' + 0.89);

		System.out.println(10 / 0.0);

	}

}
