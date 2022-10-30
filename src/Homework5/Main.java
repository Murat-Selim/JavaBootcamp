package Homework5;

import java.util.ArrayList;
import java.util.List;

import Homework5.business.CategoryManager;
import Homework5.business.CourseManager;
import Homework5.business.TeacherManager;
import Homework5.core.logging.DatabaseLogger;
import Homework5.core.logging.EmailLogger;
import Homework5.core.logging.FileLogger;
import Homework5.core.logging.Logger;
import Homework5.dataAccess.HibernateCategoryDao;
import Homework5.dataAccess.HibernateCourseDao;
import Homework5.dataAccess.JdbcTeacherDao;
import Homework5.entities.Category;
import Homework5.entities.Course;
import Homework5.entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception{		
		
		Teacher teacher = new Teacher(1, "Engin", "Demiroð");

		Course course1 = new Course(1, "Java Camp", 200, "Java OOP Developer Program", teacher);		
		List<Course> courses = new ArrayList<>();
		
		Category category = new Category(1, "Software");
		List<Category> categories = new ArrayList<>();
		
		
		Logger[] loggers = {new DatabaseLogger(), new EmailLogger(), new FileLogger()};
		
		TeacherManager teacherManager = new TeacherManager(new JdbcTeacherDao(), loggers); 
		teacherManager.add(teacher);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		courseManager.add(course1);

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		categoryManager.add(category);

		

	}

}
