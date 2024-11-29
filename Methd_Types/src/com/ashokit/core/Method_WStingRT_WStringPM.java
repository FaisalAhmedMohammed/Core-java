package com.ashokit.core;

public class Method_WStingRT_WStringPM {
	public static void main(String[] args) {
		Method_WStingRT_WStringPM s = new Method_WStingRT_WStringPM();
		String x = s.concat("faisal", "ahmed");
		System.out.println(x);
	}

	String concat(String fname, String lname) {
		return fname + lname;
	}

}
/* int[] arr={1,2,3,4,5,6};
 * Maximum m=new Maximum();
 * int x=m.findmax();
 * sysou(x);
 * int findmax(int[] arr)
 * {
 * return Arrays.toString(arr);
 * 
 * }
 * */
