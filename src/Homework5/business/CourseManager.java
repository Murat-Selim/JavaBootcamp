package Homework5.business;

import java.util.List;

import Homework5.core.logging.Logger;
import Homework5.dataAccess.CourseDao;
import Homework5.entities.Course;

public class CourseManager implements CourseService {
	
	private CourseDao courseDao;
	private List<Course> courses;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}
	
	@Override
	public void add(Course course) throws Exception{
		if(course.getCoursePrice() < 0) 
			throw new Exception("Fiyat 0 dan kucuk olamaz");
		
		for(Course course1: courses) {
			if(course1.getCourseName() == course.getCourseName()) {
				throw new Exception("Kurs ismi tekrar edemez");
			}
		}
			
		courseDao.add(course);
		
		for(Logger logger : loggers)
			logger.log(course.getCourseName());
	}

}
