package in.ashokit.co;

public class DefaultCons {
	int id;
	String name;
	int age;

	public DefaultCons(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "DefaultCons [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		DefaultCons d = new DefaultCons(10, "faisal", 24);
		System.out.println(d);

	}

}
