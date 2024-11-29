package in.ashokit.co;

public class Employee {
	String name;
	double sal;

	public Employee(String name, double sal) {
		this.name = name;
		this.sal = sal;
		System.out.println(this.name + " " + this.sal);

	}

	public static void main(String[] args) {
		Employee emp = new Employee("ashok", 67000);
		Employee emp1 = new Employee("ramu", 55000);

	}

}
