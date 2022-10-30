package Homework5.dataAccess;

import Homework5.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao{

	@Override
	public void add(Teacher teacher) {
		System.out.println("Added to database with Hibernate: " + teacher.getFirstName() + " " + teacher.getLastName());	
	}
}
