package inheritance.library;

public class Staff extends User{
	private String departmentName;
	Staff(String name, int id, String departmentName){
		super(name, id);
		this.departmentName = departmentName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
