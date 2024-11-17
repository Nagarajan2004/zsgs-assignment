package packages.university.faculty;

public class Faculty {
	private int facultyId;
	private String name;
	private String department;

	public Faculty(int facultyId, String name, String department) {
		this.facultyId = facultyId;
		this.name = name;
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Faculty ID : "+facultyId+"\n"+
				"Faculty Name : "+name+"\n"+
				"Department : "+department+"\n";
	}
}
