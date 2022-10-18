package abstractDemo;

public class CustomerManager {
	private BaseDBManager _db;
	
	public CustomerManager(BaseDBManager db) {
		_db = db;
	}
	public void getCustomers() {
		_db.getData();
	}
}
