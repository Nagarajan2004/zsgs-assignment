package packages.university.courses;

public class Course {
	private int courseId;
	private String courseName;
	
	public Course(int courseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	public int getCourseId() {
		return courseId;
	}
	
	public String getCoursename() {
		return courseName;
	}
	
	public String toString() {
		return "ID :"+courseId+"\n"+"Course Name : "+courseName+"\n";
	}
	
}
