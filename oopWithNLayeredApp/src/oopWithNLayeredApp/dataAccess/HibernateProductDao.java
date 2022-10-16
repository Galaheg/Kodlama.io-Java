package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao/*Data access object*/ {
	public void add(Product product) {
		System.out.println("Added to db using Hibernate");
	}
}
