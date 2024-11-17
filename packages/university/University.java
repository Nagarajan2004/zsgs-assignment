package packages.university;

import java.util.Scanner;

import packages.university.courses.Course;
import packages.university.database.UniversityDatabase;
import packages.university.faculty.Faculty;
import packages.university.students.Student;

public class University {
	private Scanner scanner;
	private UniversityDatabase universityDatabase;
	
	public University() {
		scanner = new Scanner(System.in);
		universityDatabase = UniversityDatabase.getInstance();
	}
	
	public void init() {
		Course course1 = new Course(1, "JAVA");
		Course course2 = new Course(2, "HTML");
		universityDatabase.addCourse(course1);
		universityDatabase.addCourse(course2);
		System.out.println("----------courses----------");
		System.out.println(course1);
		System.out.println(course2);
		
		System.out.println("\n----------Faculty-----------");
		Faculty faculty1 = new Faculty(1, "Thamarai", "ZS");
		Faculty faculty2 = new Faculty(2, "Nadimuthu", "ZSGS");
		universityDatabase.addFaclty(faculty1);
		universityDatabase.addFaclty(faculty2);
		System.out.println(faculty1);
		System.out.println(faculty2);
		
		System.out.println("\n-----------Student-----------");
		Student student1 = new Student(1, "nagarajan", "ZSGS");
		Student student2 = new Student(2, "Krishnamoorthy", "ZS");
		Student student3 = new Student(3, "hari", "ZSGS");
		Student student4 = new Student(4, "Gowthm", "ZS");
		student1.addCoure(course1);
		student2.addCoure(course2);
		student3.addCoure(course1);
		student4.addCoure(course2);
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
	}
	
}
