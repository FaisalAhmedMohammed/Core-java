package com.ashokit.oop;

/*    - - - *
 *    - - * *
 *    - * * *
 *    * * * *    
 *    here we are using a loop to print spaces */
public class Pattern_07 {
	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print("-" + " ");

			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
