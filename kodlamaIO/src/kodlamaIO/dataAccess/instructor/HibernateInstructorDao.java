package kodlamaIO.dataAccess.instructor;

import kodlamaIO.entities.Instructor;

public class HibernateInstructorDao implements IinstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added to db using hibernate: "+instructor.getFirstName()+" "+instructor.getLastName());
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Instructor deleted from db using hibernate: "+instructor.getFirstName()+" "+instructor.getLastName());
	}


}
