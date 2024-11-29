package in.ashokit.co;

import java.util.Scanner;

class Product {
	int pid;
	String pname;
	double price;
/*/
 * this is not the correct way of writing scannner inside a method it should be defined in main method  
 */
	public void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product id");
		pid = sc.nextInt();
		
		sc.nextLine();

		System.out.println("Enter product name");
		pname = sc.nextLine();

		System.out.println("Enter product price");
		price = sc.nextDouble();
	}

	public void disiplayOutput() {
		System.out.println(pid + " " + pname + " " + price);
	}
}

public class Tester {
	public static void main(String[] args) {
		Product p=new Product();
		p.acceptInput();
		p.disiplayOutput();

	}

}
