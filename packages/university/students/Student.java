package packages.university.students;

import java.util.ArrayList;
import java.util.List;

import packages.university.courses.Course;

public class Student {
	private int studentId;
	private String name;
	private String department;
	private List<Course> courses;

	public Student(int sId, String name, String department) {
		this.studentId = sId;
		this.name = name;
		this.department = department;
		this.courses = new ArrayList<Course>();
	}
	
	public void addCoure(Course course) {
		this.courses.add(course);
	}

	public int getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public List<Course> getCourses() {
		return courses;
	}
	
	public String toString() {
		return "ID: "+studentId+"\n"+
				"Name : "+name+"\n"+
				"Department : "+department+"\n"+
				"Courses : ["+ courses +"]\n";
	}
}
