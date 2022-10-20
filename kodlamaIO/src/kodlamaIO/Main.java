package kodlamaIO;

import java.util.Arrays;
import java.util.List;

import kodlamaIO.business.CategoryManager;
import kodlamaIO.business.CourseManager;
import kodlamaIO.business.InstructorManager;
import kodlamaIO.core.CloudLogger;
import kodlamaIO.core.DBLogger;
import kodlamaIO.core.FileLogger;
import kodlamaIO.core.ILogger;
import kodlamaIO.core.MailLogger;
import kodlamaIO.dataAccess.category.JdbcCategoryDao;
import kodlamaIO.dataAccess.course.JdbcCourseDao;
import kodlamaIO.dataAccess.instructor.HibernateInstructorDao;
import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;
import kodlamaIO.entities.Instructor;

public class Main {

	public static void main(String[] args) {

		List<ILogger> loggers = Arrays.asList(new CloudLogger(), new DBLogger(), new FileLogger(), new MailLogger());
		
		Category category = new Category(1, "Programming");
		category.setUniqueName("Category: " + " " + category.getCategoryName());
		
		Instructor instructor = new Instructor("Engin", "Demirog", 1);
		instructor.setUniqueName("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
		
		Course course = new Course("Java + React", 1, instructor, category);
		course.setUniqueName("Course: " + " " + course.getCourseName());
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category);
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course);
	}

}
