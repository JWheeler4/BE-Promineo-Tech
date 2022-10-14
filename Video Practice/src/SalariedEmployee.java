
public class SalariedEmployee extends Employee {

	public SalariedEmployee(String firstName, String lastName, double pay) {
		super(firstName, lastName, pay);
	}

	@Override
	public double calculatePay() {
		return getPay() * 80;
	}
	
}
