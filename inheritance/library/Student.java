package inheritance.library;

public class Student extends User{
	private String className;
	Student(String name, int id, String className){
		super(name, id);
		this.className = className;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
}
