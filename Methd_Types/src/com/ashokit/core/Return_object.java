package com.ashokit.core;

public class Return_object {

	college cdetails() {
		college c = new college();
		c.code = 123;
		c.name = "ashokit";
		return c;
	}

	public static void main(String[] args) {
		Return_object r = new Return_object();
		college cd = r.cdetails();// this method is returning college object and storing in college variable
		System.out.println(cd.code + " " + cd.name);//printing the data using object

	}

}

class college {
	int code;
	String name;
}
