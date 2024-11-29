package com.ashokit.core;

import java.util.Scanner;

/*this program about sides of triangle
 * if the three sides are equal than it is Equilateral triangle
 * it two sides are equal than it is Isosceles triangle
 * if all side are different then it is scalane triangel*/
public class ElseIf_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first triange");
		int side1 = sc.nextInt();
		System.out.println("Enter second triange");
		int side2 = sc.nextInt();

		System.out.println("Enter third triange");
		int side3 = sc.nextInt();

		if (side1 == side2 && side1 == side3) {
			System.out.println("It is Equilateral triangle");
		} else if (side1 == side2 || side1 == side3 || side2 == side3) {
			System.out.println("It is Isosceles triangle");
		} else {
			System.out.println("It is Scalane triangel");
		}
	}

}
