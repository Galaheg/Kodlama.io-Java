package kodlamaIO.dataAccess.category;

import kodlamaIO.entities.Category;

public class JdbcCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Category added to db using Jdbc: "+category.getCategoryName());
	}

	@Override
	public void delete(Category category) {
		System.out.println("Category deleted from db using Jdbc: "+category.getCategoryName());
	}


}
