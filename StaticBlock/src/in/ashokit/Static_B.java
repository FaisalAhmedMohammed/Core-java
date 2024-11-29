package in.ashokit;

class Employee {
	private double salary;
	private static double foodFee;

	Employee(double salary) {
		this.salary = salary;
	}

	static {
		foodFee = 2000.00;
		System.out.println(foodFee);
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}
	

}

class privateEmpllyee extends Employee {

	privateEmpllyee(double salary) {
		super(salary);
	}

	@Override
	public String toString() {
		return "privateEmpllyee [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	

}

class ContractEmployee extends Employee {

	ContractEmployee(double salary) {
		super(salary);
	}

}

public class Static_B {
	public static void main(String[] args) {
		privateEmpllyee pe=new privateEmpllyee(25000.0);
		System.out.println(pe);
		ContractEmployee ce=new ContractEmployee(5000.00);
		System.out.println(ce);
		 

	}

}
