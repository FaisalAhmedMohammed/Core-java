package in.ashokit.co;

public class Bike {
	public void drive() {
		BikeEngine eng=new BikeEngine();
		eng.start();
		System.out.println("journey started");
	}
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.drive();
	}

}
