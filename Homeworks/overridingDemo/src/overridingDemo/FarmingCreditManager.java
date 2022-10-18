package overridingDemo;

public class FarmingCreditManager extends BaseCreditManager{

	@Override
	public double calculate(double amount) {
		System.out.print("Credit amount that can be used for farming is: ");
		return amount*1.19;
		
	}
	
}
