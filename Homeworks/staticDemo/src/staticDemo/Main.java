package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager pM = new ProductManager();
		Product product = new Product();
		product.price = 10;
		product.name="Mouse";
		pM.add(product);
	}

}
