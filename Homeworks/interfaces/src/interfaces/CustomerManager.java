package interfaces;

public class CustomerManager {
	private ICustomerDal _iCD;

	public CustomerManager(ICustomerDal iCD) {
		_iCD = iCD;
	}

	public void add() {
		_iCD.add();
	}
}
