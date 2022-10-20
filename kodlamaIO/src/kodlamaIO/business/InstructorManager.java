package kodlamaIO.business;

import java.util.List;

import kodlamaIO.core.ILogger;
import kodlamaIO.dataAccess.instructor.IinstructorDao;
import kodlamaIO.entities.Instructor;

public class InstructorManager{
	private List<ILogger> _loggers;
	private IinstructorDao _instructorAccess;

	public InstructorManager(IinstructorDao instructorAccess, List<ILogger> loggers) {
		_loggers = loggers;
		_instructorAccess = instructorAccess;
	}

	public void add(Instructor instructor) {

		_instructorAccess.add(instructor);
		for (ILogger iLogger : _loggers) {
			iLogger.log(instructor);
		}
	}
}
