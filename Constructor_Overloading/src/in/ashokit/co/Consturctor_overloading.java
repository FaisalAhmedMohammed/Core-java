package in.ashokit.co;

public class Consturctor_overloading {
	int id;
	String name;
	int age;

	public Consturctor_overloading() {

	}

	public Consturctor_overloading(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println(this.id + " " + this.name);

	}

	public Consturctor_overloading(String name) {
		this.name = name;
		System.out.println(this.name);

	}

	public static void main(String[] args) {
		Consturctor_overloading co = new Consturctor_overloading();
		Consturctor_overloading c1 = new Consturctor_overloading(101, "ashok");
		Consturctor_overloading c2 = new Consturctor_overloading("faisal");

	}

}
