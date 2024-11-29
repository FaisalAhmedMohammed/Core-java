package in.ashokit.co;

public class Test {
	private int id;
	private String name;

	 Test() {
		System.out.println("test::constructor is called");
	}

	private void m1() {
		System.out.println("m1()method");
	}

	public void m2() {
		m1();
		System.out.println("m2()method is calling m1()method");
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m2();
		t.m1();
		t.id = 101;
		t.name = "faisal";
		System.out.println(t.id + " " + t.name);
	}

}
