package in.ashokit.co;

public class Demo {
	public Demo(int i, int j) {// i and j are local variable we cannot access it outside of constructor
		System.out.println("Hello");
		System.out.println(i + " " + j);
	}

	public static void main(String[] args) {
		Demo d = new Demo(100, 60);
	}

}
