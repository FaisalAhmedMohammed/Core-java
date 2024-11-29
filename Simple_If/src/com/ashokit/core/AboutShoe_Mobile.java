package com.ashokit.core;
/*
 * This program takes product type, material, brand and price as input
 * if product type is shoe and material is leather then add 15% as GST for the price
 * if product type is mobile and brand is apple then add 12% as GST for the price
 * Otherwise, add 10% as GST for the price. 
 */

import java.util.Scanner;

public class AboutShoe_Mobile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product type(shoe/mobile)");
		String product_type = sc.nextLine();
		if (product_type.equalsIgnoreCase("shoe")) {
			System.out.println("Enter material");
			String material = sc.nextLine();

			System.out.println("Enter price");
			double price = sc.nextDouble();

			if (material.equalsIgnoreCase("leather")) {

				double gst = price * 0.15;
				price = price + gst;

			} else {
				double gst = price * 0.10;
				price = price + gst;
			}
			System.out.println("product Type:" + product_type);
			System.out.println("Material:" + material);
			System.out.println("Final price:" + price);

		} else if (product_type.equalsIgnoreCase("mobile")) {
			System.out.println("Enter Brand");
			String brand = sc.nextLine();
			System.out.println("Enter Price");
			double price = sc.nextDouble();

			if (brand.equalsIgnoreCase("apple")) {
				double gst = price * 0.12;
				price = price + gst;

			} else {
				double gst = price * 0.10;
				price = price + gst;
			}
			System.out.println("Product Type:" + product_type);
			System.out.println("Brand:" + brand);
			System.out.println("Final price:" + price);
		} else {
			System.out.println("Invalid product");
		}
	}

}
