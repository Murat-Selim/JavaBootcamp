package Homework5.dataAccess;

import Homework5.entities.Teacher;

public class JdbcTeacherDao implements TeacherDao {

	@Override
	public void add(Teacher teacher) {
		System.out.println("Added to database with Jdbc: " + teacher.getFirstName() + " " +  teacher.getLastName());
	}
}
