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

	public void add(Category category) {

		_categoryAccess.add(category);
		for (ILogger iLogger : _loggers) {
			iLogger.log(category);
		}
	}

}
