package in.ahmed;

class Operation {

	public void divide(int a, int b) {
		try {
			int c = a / b;
			System.out.println(a + " divided by " + b + " is " + c);
		} catch (Exception ex) {
			System.out.println("please enter correct input");
		}
		finally {
			System.out.println("bye");
		}
	}

}

public class Tester {
	public static void main(String[] args) {

		Operation op = new Operation();
		op.divide(5, 1);

	}
}
