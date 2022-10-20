package kodlamaIO.dataAccess.category;

import kodlamaIO.entities.Category;

public interface ICategoryDao {
	void add(Category category);
	void delete(Category category);
}
