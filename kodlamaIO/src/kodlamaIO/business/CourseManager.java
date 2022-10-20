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

	public void add(Course course) {

		_courseAccess.add(course);
		for (ILogger iLogger : _loggers) {
			iLogger.log(course);
		}
	}
}
