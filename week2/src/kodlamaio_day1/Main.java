package kodlamaio_day1;

public class Main {
	public static void main(String[] args) {
		String mesaj = "Vade Oranı";

		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		//set values
		product1.setName("Delonghi kahve makinesi");
		product1.setUnitPrice(7100);
		product1.setDiscount(0);
		product1.setUnitsInStock(111);
		product1.setImURL("random.jpg");
		
		product2.setName("Arzum kahve makinesi");
		product2.setUnitPrice(1999);
		product2.setDiscount(0);
		product2.setUnitsInStock(11);
		product2.setImURL("random2.jpg");
		
		product3.setName("Beko kahve makinesi");
		product3.setUnitPrice(2400);
		product3.setDiscount(3);
		product3.setUnitsInStock(11);
		product3.setImURL("random3.jpg");
		
		Product[] products = {product1,product2,product3};
		
		/*for (Product product : products) {
			System.out.println(product.name);
		}*/
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"<li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer indCustomer = new IndividualCustomer();
		
		indCustomer.setId(1);
		indCustomer.setFirstName("Emre");
		indCustomer.setLastName("Inan");
		indCustomer.setCustNo("123123123");
		indCustomer.setPhone("5075075072");
		
		CorporateCustomer corpCustomer = new CorporateCustomer();
		corpCustomer.setId(2);
		corpCustomer.setCompanyName("Java.io");
		corpCustomer.setTaxNumber("123123132123");
		corpCustomer.setCustNo("131313131");
		corpCustomer.setPhone("5075075072");
		
		Customer[] customers = {indCustomer,corpCustomer};
	}

}
