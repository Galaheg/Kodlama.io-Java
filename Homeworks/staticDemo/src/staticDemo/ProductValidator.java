package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static constructor had started");
	}
	
	static {
		System.out.println("Second static constructor had started");
	}
	
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static class InnerClass{
		
		public static void innerFunction() {
			System.out.println("Inner print");
		}
		
	}
}
