package in.ashokit.co;

public class BankAccount {
	private int accountNo = 123456;
	private String name = "ashok";
	private double balance = 77000.0;

	public void setAccountNO(int accountNo) {

		this.accountNo = accountNo;
	}

	public int getAccountNo() {
		return this.accountNo;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return this.name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + "]";
	}

}
