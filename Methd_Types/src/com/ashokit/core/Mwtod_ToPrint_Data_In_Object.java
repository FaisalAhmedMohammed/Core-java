package com.ashokit.core;

public class Mwtod_ToPrint_Data_In_Object {

	public static void main(String[] args) {

		Mwtod_ToPrint_Data_In_Object m = new Mwtod_ToPrint_Data_In_Object();
		student s = new student();
		s.id = 10;
		s.name = "faisal";
		m.printStudentData(s);/*
								 * this method is expecting  students object as parameter so first we need to
								 * create student class object and pass it.
								 */

	}

	void printStudentData(student ss) { /* hers s is a variable  which belongs to student class using this variable we can 
	access all the properties of student*/
		System.out.println(ss.id);
		System.out.println(ss.name);

	}
}

class student {
	int id;
	String name;
}
