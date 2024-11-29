package in.ashokit;

public class Static_Variable {

	private int id; // Instance variable
	private String name; // Instance variable
	private double salary; // Instance variable

	private static String company; // Static variable shared across all objects

	// Constructor to initialize instance variables
	public Static_Variable(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		company = "Ashok It";
		/*
		 * here what happens is when ever object is called constructor  executed every
		 * time static block is reinitialize again and again this is draw back so we
		 * need to go for static block.
		 */
	}

	// Getters and setters for instance variables
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Getters and setters for the static variable
	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Static_Variable.company = company;
	}

	// Override toString to display object details
	@Override
	public String toString() {
		return "Static_Variable [id=" + id + ", name=" + name + ", salary=" + salary + ", company=" + company + "]";
	}

	// Main method to test the program
	public static void main(String[] args) {
		// Set the static variable

		// Create objects and initialize them
		Static_Variable emp1 = new Static_Variable(101, "Alice", 50000);
		Static_Variable emp2 = new Static_Variable(102, "Bob", 60000);

		// Display the object details
		System.out.println(emp1);
		System.out.println(emp2);

	}
}
