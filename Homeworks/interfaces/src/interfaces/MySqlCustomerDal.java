package interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository{

	public void add() {
		System.out.println("Added to Mysql");
	}

}
