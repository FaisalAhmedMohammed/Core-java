package in.ashokit.co;

public class User1 {
	int id;
	String name;
	}



class students extends User1 {
	void show() {
		students stu = new students();
		stu.id = 101;
		stu.name = "ashok";
		System.out.println(stu.id + " " + stu.name);
	}
}

class Employee extends User1 {
	public void m1() {

		Employee emp = new Employee();
		emp.id = 121;
		emp.name = "faisal";
		System.out.println(emp.id + " " + emp.name);
	}
	public static void main(String[] args) {
	}
}
