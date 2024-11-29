package in.ashokit.co;

public class Car {
	void drive() {
		Engine e = new Engine();
		e.start();
		System.out.println("journey started");
	}
	public static void main(String[] args) {
		Car car=new Car();
		car.drive();
	}

}
