package overridingDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<BaseCreditManager> credits = Arrays.asList(new FarmingCreditManager(), new TeacherCreditManager());

		for (BaseCreditManager bcm : credits) {
			System.out.println(bcm.calculate(1000));
		}
	}

}
