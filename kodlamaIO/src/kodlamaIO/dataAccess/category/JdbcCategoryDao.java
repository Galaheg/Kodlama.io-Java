package kodlamaIO.dataAccess.category;

import java.util.Arrays;
import java.util.List;

import kodlamaIO.entities.Category;

public class JdbcCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Category added to db using Jdbc: " + category.getCategoryName());
	}

	@Override
	public void delete(Category category) {
		System.out.println("Category deleted from db using Jdbc: " + category.getCategoryName());
	}

	@Override
	public List<Category> getCategories() {
		List<Category> categories = Arrays.asList(new Category(2, "English"), new Category(3, "TYT-AYT"));
		return categories;
	}

}
