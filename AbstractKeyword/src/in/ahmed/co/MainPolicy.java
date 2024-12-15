package in.ahmed.co;

public class MainPolicy {
	public static void main(String[] args) {
		InsurancePolicy is = new HealthInsurancePolicy(3000.0, 51, false);
		 System.out.println(is.calculatePremium());
	}

}
