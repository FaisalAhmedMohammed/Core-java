package com.ashokit.core;

public class MTo_ret_Person_As_Object {

	person getData() {
		person p = new person();
		p.id = 10;
		p.name = "ashok";
		p.age = 40;
		return p;// here we are returning person object as p;

	}

	public static void main(String[] args) {
		MTo_ret_Person_As_Object m = new MTo_ret_Person_As_Object();
		person data = m.getData();
		System.out.println(data.id + " " + data.name + " " + data.age);

	}

}

class person {
	int id;
	String name;
	int age;

}
