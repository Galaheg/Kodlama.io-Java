package oopWithNLayeredApp;

import java.util.Arrays;
import java.util.List;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DBLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"Iphone 11",14000);
		List<Logger> loggers = Arrays.asList(new DBLogger(), new FileLogger(), new MailLogger());
		ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
		productManager.add(product1);
	}

}
