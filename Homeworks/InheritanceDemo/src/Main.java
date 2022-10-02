
public class Main {

	public static void main(String[] args) {
		TeacherCreditManager tCM = new TeacherCreditManager();
		tCM.calculate();
		CreditUI krediUI = new CreditUI();
		krediUI.creditCalculate(new TeacherCreditManager());

	}

}
