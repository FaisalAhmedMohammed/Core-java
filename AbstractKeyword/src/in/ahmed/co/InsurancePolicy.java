package in.ahmed.co;

abstract public class InsurancePolicy {
	private double basePremium;// 3000

	public InsurancePolicy(double basePremium) {
		super();
		this.basePremium = basePremium;
	}

	abstract double calculateRiskFacor();// we have to override in child classes

	public final double calculatePremium() {
		return basePremium + calculateRiskFacor();
	}

}
