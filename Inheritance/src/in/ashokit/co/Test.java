package in.ashokit.co;

class parent {
	public void m1() {
		System.out.println("parent m1() method");
	}
	public void m2() {
		System.out.println("parent m2() method");
	}
}

class child extends parent {
	public int hashCode() {
		return 101;
	}
	public void m1() {
		System.out.println("child m1() method");
	}

	public void m2() {
		System.out.println("child m2() method");
		super.m2();
	}

}

public class Test {
	public static void main(String[] args) {
		child c = new child();
		c.m1();
		c.m2();
		int hashCode = c.hashCode();
		System.out.println("Hash code "+hashCode);

	}

}
