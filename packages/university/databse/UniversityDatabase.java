package packages.university.database;

import java.util.ArrayList;
import java.util.List;

import packages.university.courses.Course;
import packages.university.faculty.Faculty;
import packages.university.students.Student;

public class UniversityDatabase {
	private static UniversityDatabase universityDatabase;
	
	private List<Course> courses = new ArrayList<Course>();
	private List<Faculty> facultys = new ArrayList<Faculty>();
	private List<Student> students = new ArrayList<Student>();
	
	public static UniversityDatabase getInstance() {
		if(universityDatabase == null) {
			return universityDatabase = new UniversityDatabase();
		}
		return universityDatabase;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public void addFaclty(Faculty faculty) {
		facultys.add(faculty);
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
}
