package com.ashokit.core;

public class Delete {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("spring framework");
		sb.delete(6, 16);
		System.out.println(sb);
	}

}
