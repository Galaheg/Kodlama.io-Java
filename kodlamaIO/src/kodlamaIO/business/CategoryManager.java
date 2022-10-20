package kodlamaIO.business;

import java.util.List;

import kodlamaIO.core.ILogger;
import kodlamaIO.dataAccess.category.ICategoryDao;
import kodlamaIO.entities.Category;


public class CategoryManager{
	private List<ILogger> _loggers;
	private ICategoryDao _categoryAccess;

	public CategoryManager(ICategoryDao categoryAccess, List<ILogger> loggers) {
		_loggers = loggers;
		_categoryAccess = categoryAccess;
	}

	public void add(Category category) throws Exception {
		
		for (Category categoryCheck : _categoryAccess.getCategories()) {
			if (categoryCheck.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Category names can't be the same");
			}
		}
		_categoryAccess.add(category);
		for (ILogger iLogger : _loggers) {
			iLogger.log(category);
		}
	}

}
