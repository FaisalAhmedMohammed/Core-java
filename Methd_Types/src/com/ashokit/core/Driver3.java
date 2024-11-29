package com.ashokit.core;
public class Driver3 {
	void playerDate(player p) {/*
								 * here we are passing player as a object. this object can hold the data and any
								 * number of variables
								 */
		System.out.println(p.id + " " + p.name + " " + p.age);
	}
	public static void main(String[] args) {
		Driver3 dd = new Driver3();
		player p = new player();
		p.id = 19;
		p.name = "siraj";
		p.age = 30;
		dd.playerDate(p);
	}
}
class player {
	int id;
	String name;
	int age;
}
