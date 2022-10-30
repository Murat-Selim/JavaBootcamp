package Homework5.business;

import Homework5.core.logging.Logger;
import Homework5.dataAccess.TeacherDao;
import Homework5.entities.Teacher;

public class TeacherManager implements TeacherService{
	
	private TeacherDao teacherDao;
	private Logger[] loggers;
	
	public TeacherManager(TeacherDao teacherDao, Logger[] loggers) {
		this.teacherDao = teacherDao;
		this.loggers = loggers;
	}
	

	@Override
	public void add(Teacher teacher) {
		teacherDao.add(teacher);
		
		for(Logger logger : loggers)
			logger.log(teacher.getFirstName() + " " + teacher.getLastName());
	}

}
