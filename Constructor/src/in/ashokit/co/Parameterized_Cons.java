package in.ashokit.co;

public class Parameterized_Cons {
	private int id;
	private String name;
	private int age;
	public Parameterized_Cons(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Parameterized_Cons [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public static void main(String[] args) {
	Parameterized_Cons pc=new Parameterized_Cons(101, "faisal", 24);
	System.out.println(pc);
	}

}
