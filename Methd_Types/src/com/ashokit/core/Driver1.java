package com.ashokit.core;

public class Driver1 {
	public static void main(String[] args) {

		Driver1 d = new Driver1();
		d.print();
	}

	void print() {
		product p = new product();
		p.pid = 10;
		p.pname = "esdf";
		p.price = 74857;
		System.out.println(p.pid + " " + p.pname + " " + p.price);
	}
}

class product {
	int pid;
	String pname;
	double price;
}
