package in.ahmed.co;

interface Inter {
	void m1();

	void m2();
}

public class ServiceProvider implements Inter {

	@Override
	public void m1() {
		System.out.println(" This is m1() methiod ");
	}

	@Override
	public void m2() {

	}

}
