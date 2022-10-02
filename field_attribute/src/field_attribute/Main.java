package field_attribute;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Audi");
		product.setId(1);
		product.setPrice(100000);
		product.setStockAmount(2);
		product.setDescription("brand new");
		ProductManager pM = new ProductManager(product);
	}

}
