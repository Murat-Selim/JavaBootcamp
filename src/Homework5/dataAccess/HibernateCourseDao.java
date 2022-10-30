package Homework5.dataAccess;

import Homework5.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Added to database with Hibernate: " + course.getCourseName());
	}
}
