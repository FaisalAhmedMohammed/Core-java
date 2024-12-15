package in.ahmed.co;

/*Here i am calling one constructor from another constructor
 * if i call default constructor then o/p will be :NO args constructor
 * if i call int  constructor then o/p will be :NO args constructor and int args constructor
 * if i call double  constructor then o/p will be :NO args constructor then int agrs constructor and then double
 * args constructor*/
class Test {
	Test(double d) {
		this(10);
		System.out.println("double args constructor");
	}

	Test(int i) {
		this();
		System.out.println("int args constructor");
	}

	Test() {
		System.out.println("NO args constructor");
	}

}

public class CallingOneConsFromAnother {
	public static void main(String[] args) {
		Test t = new Test(20);

	}

}
