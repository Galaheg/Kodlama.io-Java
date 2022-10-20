package kodlamaIO.entities;

public class Course extends MainWindow{
	
	private String courseName;
	private int courseId;
	private Instructor instructor;
	private Category category;

	public Course(String courseName, int courseId, Instructor instructor, Category category) {
		
		this.courseName = courseName;
		this.courseId = courseId;
		this.category = category;
		this.instructor = instructor;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
