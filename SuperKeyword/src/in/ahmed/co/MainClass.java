package in.ahmed.co;

class parent {
	String str = "parent class";

}

class child extends parent {

	String str = "child class";

	public void m1() {
		System.out.println(str);
		System.out.println(this.str);
		System.out.println(super.str);

	}
}

public class MainClass {
	public static void main(String[] args) {
		child c = new child();
		c.m1();

	}

}
