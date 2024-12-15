package in.ahmed.co;

abstract class One {
	private int x;// variables cannot access outside of class

	abstract void show();

	public One(int x) {
		super();
		this.x = x;
	}

	public int getX() { // to access private variables outside of class
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}

class Two extends One {
	int y;

	public Two(int x, int y) {
		super(x);
		this.y = y;
	}

	@Override
	void show() {
		System.out.println(getX()); // accessing private variables through setter Method .
		System.out.println(y);

	}

}

public class ConstructorExecutionInAbstact {
	public static void main(String[] args) {
		Two two = new Two(10, 20);
		two.show();
	}

}
