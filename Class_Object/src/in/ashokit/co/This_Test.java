package in.ashokit.co;

class Test {
	int x;
	int y;

	void show(int x, int y) {
		this.x = x;
		 this.y = y;
	}

	void add() {
		System.out.println(x + y);
	}
}

public class This_Test {
	public static void main(String[] args) {
		int x=10;
		int y=20;
		Test t = new Test();
		t.show(x, y);
		t.add();

	}

}
