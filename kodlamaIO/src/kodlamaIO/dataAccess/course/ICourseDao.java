package kodlamaIO.dataAccess.course;

import kodlamaIO.entities.Course;

public interface ICourseDao {
	void add(Course course);
	void delete(Course course);
}
