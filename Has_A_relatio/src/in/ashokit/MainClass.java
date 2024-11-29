package in.ashokit;

import java.util.ArrayList;
import java.util.List;

class Customer {
	private String customerName;
	private String gender;
	private int age;

	public Customer(String customerName, String gender, int age) {
		super();
		this.customerName = customerName;
		this.gender = gender;
		this.age = age;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class Policy {
	private long policyNumber;
	private double premium;
	Customer policyHolder;

	public Policy(long policyNumber, double premium, Customer policyHolder) {
		super();
		this.policyNumber = policyNumber;
		this.premium = premium;
		this.policyHolder = policyHolder;
	}

	public long getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	public Customer getPolicyHolder() {
		return policyHolder;
	}

	public void setPolicyHolder(Customer policyHolder) {
		this.policyHolder = policyHolder;
	}

}

class InsuranceCompany {
	private int registrationNumber;
	private String name;
	List<Policy> policies;

	public InsuranceCompany(int registrationNumber, String name) {
		super();
		this.registrationNumber = registrationNumber;
		this.name = name;
		policies = new ArrayList<Policy>();
	}

	public void addPolicy(Policy policy) {// policy object we are adding to the parameter
		policies.add(policy);// here we are adding the policy to policies List

	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Policy> getPolicies() {
		return policies;
	}

	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}

}

public class MainClass {
	public static void main(String[] args) {
		Customer c = new Customer("faisal", "male", 35);

		Customer c2 = new Customer("ashok", "male", 40);

		Policy p = new Policy(4323123, 25000.0, c);

		Policy p2 = new Policy(4323546, 45000.0, c2);

		InsuranceCompany company = new InsuranceCompany(12234, "HDFC argo");
		company.addPolicy(p);
		company.addPolicy(p2);
		// fetching/read all the policies from the company

		List<Policy> lst = company.policies;
		System.out.println("The policies and the customer details are :");
		for (Policy policy : lst) {
			System.out.println("policy Number :" + policy.getPolicyNumber());
			System.out.println("Premium :" + policy.getPremium());
			System.out.println("Customer Name :" + policy.getPolicyHolder().getCustomerName());
			System.out.println("customer Gender :" + policy.getPolicyHolder().getGender());
			System.out.println("customer age :" + policy.getPolicyHolder().getAge());
			System.out.println("=".repeat(70));
		}

	}

}
