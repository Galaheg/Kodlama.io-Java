package kodlamaIO.dataAccess.category;

import java.util.List;

import kodlamaIO.entities.Category;

public interface ICategoryDao {
	void add(Category category);
	void delete(Category category);
	List<Category> getCategories();
}
