package kodlamaIO.dataAccess.instructor;

import kodlamaIO.entities.Instructor;

public interface IinstructorDao {
	void add(Instructor instructor);
	void delete(Instructor instructor);
}
