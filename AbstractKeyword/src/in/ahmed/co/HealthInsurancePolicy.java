package in.ahmed.co;

public class HealthInsurancePolicy extends InsurancePolicy {
	private int age;
	private boolean isSmoker;

	public HealthInsurancePolicy(double basePremium, int age, boolean isSmoker) {
		super(basePremium);
		this.age = age;
		this.isSmoker = isSmoker;
	}

	@Override
	double calculateRiskFacor() {
		double riskFactor = 0.0;

		if (age > 50) {
			riskFactor += 2500;
		}
		if (isSmoker) {
			riskFactor += 6000;
		}

		return riskFactor;
	}

}
