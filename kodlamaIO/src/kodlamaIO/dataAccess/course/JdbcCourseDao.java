package kodlamaIO.dataAccess.course;

import java.util.Arrays;
import java.util.List;

import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;
import kodlamaIO.entities.Instructor;

public class JdbcCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> getCourses() {
		List<Course> courses = Arrays.asList(new Course("English",2,100, new Instructor("Emre", "İnan", 2),new Category(2,"English")));
		return courses;
	}


}
