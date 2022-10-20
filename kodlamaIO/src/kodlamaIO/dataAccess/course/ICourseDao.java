package kodlamaIO.dataAccess.course;

import java.util.List;

import kodlamaIO.entities.Course;

public interface ICourseDao {
	void add(Course course);
	void delete(Course course);
	List<Course> getCourses();
}
