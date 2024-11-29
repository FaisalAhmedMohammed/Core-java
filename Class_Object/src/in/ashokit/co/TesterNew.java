package in.ashokit.co;

import java.util.Scanner;

class Product1 {
	int pid;
	String pname;
	double price;

	public void acceptInput(int pid, String pname, double price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public void displayOutput() {
		System.out.println(pid + " " + pname + " " + price);
	}
}

public class TesterNew {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product id");
		int pid = sc.nextInt();
		
		sc.nextLine();

		System.out.println("Enter product name");
		 String pname = sc.nextLine();

		System.out.println("Enter product price");
		 double price = sc.nextDouble();
		 
		 	Product1 p1=new Product1();
		 	p1.acceptInput(pid, pname, price);
		 	p1.displayOutput();

	}

}
