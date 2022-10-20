package kodlamaIO.dataAccess.course;

import kodlamaIO.entities.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Course added to db using hibernate: " + course.getCourseName());
	}

	@Override
	public void delete(Course course) {
		System.out.println("Course deleted from db using hibernate: " + course.getCourseName());
	}

}
