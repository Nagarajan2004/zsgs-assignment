package classesandobjects;

public class EmployeeDTO {
	private final int employee_id;
	private String employee_name;
	private String email;
	private long phoneNumber;
	private String address;
	private static int emp_id = 0;
	
	public EmployeeDTO(String employee_name, String email, long phoneNumber, String address) {
		this.employee_id = ++emp_id;
		this.employee_name = employee_name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getEmployee_id() {
		return employee_id;
	}
	
}
