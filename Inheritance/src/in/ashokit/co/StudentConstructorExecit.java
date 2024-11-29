package in.ashokit.co;

public class StudentConstructorExecit extends User {
	int rank;

	public StudentConstructorExecit() {
		System.out.println("child constructor");
	}

	public void m2() {
		System.out.println("child method");
	}

	public static void main(String[] args) {
		StudentConstructorExecit st = new StudentConstructorExecit();
		st.id = 101;
		st.name = "ashok";
		st.rank = 1;
		System.out.println(st.id + " " + st.name + " " + st.rank);
		st.m1();
		st.m2();
	}

}
