package in.ashokit.co;

/* here we are calling one method inside another method */
public class Bike {
	public void drive() {
		BikeEngine eng = new BikeEngine();
		eng.start();// calling another method of different class
		System.out.println("journey started");
	}

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.drive();
	}

}
