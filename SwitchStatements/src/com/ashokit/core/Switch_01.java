package com.ashokit.core;

public class Switch_01 {
	public static void main(String[] args) {
		int x = 10;
		switch (x*2) {
		case 10:
			System.out.println("Ten");
			break;
		case 20:
			System.out.println("Twenty");
			break;
		case 30:
			System.out.println("Thirty");
			break;
		default:
			System.out.println("Hello");
		}
	}

}
