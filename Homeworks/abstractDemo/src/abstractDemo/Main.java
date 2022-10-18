package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager cM = new CustomerManager(new OracleDBManager());
		cM.getCustomers();
	}

}
