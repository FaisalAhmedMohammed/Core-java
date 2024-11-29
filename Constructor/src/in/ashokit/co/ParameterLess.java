package in.ashokit.co;
//parameter constructor will assign the same data for all the objects

class Customer {
	private int id;
	private String name;
	private String email;

	public Customer() {
		id = 101;
		name = "faisal";
		email = "faisl@123";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}

public class ParameterLess {
	public static void main(String[] args) {
		Customer cc = new Customer();
		System.out.println(cc);

		cc.setName("ashok");
		System.out.println("updated Name is : " + cc.getName());

		Customer c = new Customer();
		System.out.println(c);

	}

}
