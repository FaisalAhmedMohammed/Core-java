package com.core.java;

import java.util.Scanner;

public class EmiCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("principle of amount");
		int p = sc.nextInt();

		System.out.println("rate of interset");
		double pa = sc.nextDouble();

		System.out.println("tenure of months");
		int n = sc.nextInt();

		// here converting rate of interest from per annum to per month

		double r = pa / 12 / 100;

		double emi = p * r * Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1);
		System.out.println(emi);
	}

}
