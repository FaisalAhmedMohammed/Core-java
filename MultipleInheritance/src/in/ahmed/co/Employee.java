package in.ahmed.co;

import java.util.ArrayList;
import java.util.List;

interface CrudRepo {
	void save();

	void find();

}

interface SortingRepo {
	void sortByName();

	void sortBySal();
}

public class Employee implements CrudRepo, SortingRepo {

	private int empid;
	private String name;
	private Double salary;

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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employee(int empid, String name, Double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

	}

	@Override
	public void sortByName() {

	}

	@Override
	public void sortBySal() {

	}

	@Override
	public void save() {

	}

	@Override
	public void find() {

	}

}
