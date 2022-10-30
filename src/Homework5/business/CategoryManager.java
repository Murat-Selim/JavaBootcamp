package Homework5.business;

import java.util.List;

import Homework5.core.logging.Logger;
import Homework5.dataAccess.CategoryDao;
import Homework5.entities.Category;

public class CategoryManager implements CategoryService {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	@Override
	public void add(Category category) throws Exception {
		
		for (Category category1 : categories) {
			if(category1.getCategoryName() == category.getCategoryName()) {
				throw new Exception("Kategori ismi tekrar edemez");
			}
		}
		
		categoryDao.add(category);
		
		for(Logger logger: loggers) {
			logger.log(category.getCategoryName());
	    }
	}

}
