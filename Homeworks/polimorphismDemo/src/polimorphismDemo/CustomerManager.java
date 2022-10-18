package polimorphismDemo;

public class CustomerManager {
	private BaseLogger _baselogger;
	
	public CustomerManager(BaseLogger baselogger) {
		_baselogger = baselogger;
	}
	public void add() {
		System.out.println("Customer added: ");
		
		_baselogger.Log("Log message from customer");
	}
}
