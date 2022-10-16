package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private List<Logger> loggers;
	
	public ProductManager(ProductDao productDao, List<Logger> loggers) {
		this.productDao = productDao;
		this.loggers=loggers;
	}

	
	public void add(Product product) throws Exception {
		if(product.getPrice()<10) {
			throw new Exception("Unit price can't be less than 10");
		}
		
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}
}
