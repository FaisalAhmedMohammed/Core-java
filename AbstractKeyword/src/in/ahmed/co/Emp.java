package in.ahmed.co;

abstract class Employee {
	private int empid;
	private String name;

	public Employee(int empid, String name) {
		this.empid = empid;
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract void calculateSalary();

}

class PermenentEmployee extends Employee {
	private double monthlySalary;

	public PermenentEmployee(int empid, String name, double monthlySalary) {
		super(empid, name);
		this.monthlySalary = monthlySalary;
	}

	@Override
	void calculateSalary() {
		System.out.println("PermenentEmployee Salary is  :"+ getEmpid()+" " +  getName()+ " " +  monthlySalary);

	}

}

class ContactEmployee extends Employee {
	private int hoursWorked;
	private double hourlyRate;

	public ContactEmployee(int empid, String name, int hoursWorked, double hourlyRate) {
		super(empid, name);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	void calculateSalary() {
		double totalSalary = hoursWorked * hourlyRate;
		System.out.println("Contect Employee Salary :" + totalSalary);

	}

}

public class Emp {
	public static void main(String[] args) {
		PermenentEmployee pm = new PermenentEmployee(101, "sita", 50000);
		/* when we create an object for permenentEmployee class first control goes to child class
		 * constructor . In  child class constructor first statement is super it will call parent class
		 * constructor so parent class constructor can initialize the data members of it */
		ContactEmployee ce = new ContactEmployee(201, "ram", 30, 500);
		pm.calculateSalary();
		ce.calculateSalary();
	}

}
