package kodlamaIO.business;

import java.util.List;

import kodlamaIO.core.ILogger;
import kodlamaIO.dataAccess.course.ICourseDao;
import kodlamaIO.entities.Course;

public class CourseManager {
	private List<ILogger> _loggers;
	private ICourseDao _courseAccess;

	public CourseManager(ICourseDao courseAccess, List<ILogger> loggers) {
		_loggers = loggers;
		_courseAccess = courseAccess;
	}

	public void add(Course course) throws Exception {
		
		for (Course courseChceck : _courseAccess.getCourses()) {
			if(courseChceck.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Course names can't be the same");
			}
		}
		if(course.getCoursePrice()<=0) {
			throw new Exception("Course price can't be 0 or lower");
		}
		
		_courseAccess.add(course);
		for (ILogger iLogger : _loggers) {
			iLogger.log(course);
		
		}
	}
}
