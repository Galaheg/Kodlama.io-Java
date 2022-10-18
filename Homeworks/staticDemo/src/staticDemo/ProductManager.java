package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		if (ProductValidator.isValid(product)) {
			System.out.println("Added to db");
		}
		else
			System.out.println("Wrong product info");
		
	}
}
