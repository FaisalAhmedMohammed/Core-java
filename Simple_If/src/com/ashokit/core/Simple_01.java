package com.ashokit.core;

/* This program accepts customer type,food name and quantity as input
 * it calculates  total price based on unit
 *if customer type is regular then additionally 10% discount will be given */
import java.util.Scanner;

public class Simple_01 {
	public static void main(String[] args) {
		System.out.println("Enter coustomer Type  (reguler/guest )");
		Scanner sc = new Scanner(System.in);
		String coustmerType = sc.nextLine();
		System.out.println("Enter Food name (veg biryani/chapati)");
		String foodName = sc.nextLine();
		System.out.println("Enter quantity");
		double quantity = sc.nextInt();

		double biryani_price = 190;
		double chapati_price = 60;

		double total_price = 0.0;

		if (foodName.equals("veg biryani")) {
			total_price = quantity * biryani_price;

		}
		if (foodName.equals("chapati")) {
			total_price = quantity * chapati_price;
		}
		// calculating the price
		total_price = total_price - (total_price * 0.05);
		// if the customer type is regular then additional 10% discount

		if (coustmerType.equals("reguler")) {
			total_price = total_price - (total_price * 0.10);
		}
		System.out.println("customer Type:" + coustmerType);
		System.out.println("foodName:" + foodName);
		System.out.println("quqntity:" + quantity);
		System.out.println("total_price:" + total_price);

	}

}
