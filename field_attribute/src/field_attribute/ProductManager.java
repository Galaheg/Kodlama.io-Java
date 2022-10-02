package field_attribute;

public class ProductManager {
	Product product = new Product();
	public ProductManager(Product product) {
		this.product = product;
		Add();
	}
	
	public void Add() {
		System.out.println("Product added: " + product.getName());
	}
}
