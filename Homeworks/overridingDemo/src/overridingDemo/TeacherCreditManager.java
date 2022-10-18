package overridingDemo;

public class TeacherCreditManager extends BaseCreditManager{

	@Override
	public double calculate(double amount) {
		System.out.print("Credit amount that can be used for teaching is: ");
		return amount*2.05;
		
	}

}
