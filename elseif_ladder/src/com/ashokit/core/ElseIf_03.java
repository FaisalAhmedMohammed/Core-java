package com.ashokit.core;

import java.util.Scanner;

//this program is used to print the student grade based on their marks
public class ElseIf_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student marks");
		int marks = sc.nextInt();
		if (marks >= 90 && marks <= 100) {
			System.out.println("your grade is A");
		} else if (marks >= 80 && marks <= 90) {
			System.out.println("your grade is B");
		} else if (marks >= 70 && marks <= 80) {
			System.out.println("your grade is C");
		} else if (marks >= 60 && marks <= 70) {
			System.out.println("your grade is D");
		} else if (marks >= 50 && marks <= 60) {
			System.out.println("your grade is E");
		} else {
			System.out.println("invalid scrode plese enter the number between 0 to 100");
		}
	}

}
