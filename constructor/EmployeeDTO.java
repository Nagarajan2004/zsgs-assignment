package classesandobjects;

import java.util.ArrayList;
import java.util.List;

class Employee {
	private final int employee_id;
	private String employee_name;
	private String email;
	private long phoneNumber;
	private String address;
	private static int emp_id = 0;
	
	public Employee(String employee_name, String email, long phoneNumber, String address) {
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

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + "]\n";
	}
	
	
}

public class EmployeeDTO{
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Tamil", "tamil@gamil.com", 8397273919L, "20-1, 2nd street, madurai"));
		employees.add(new Employee("Arun", "arun@gamil.com", 9997233919L, "22, 2nd floor, 5th street, chennai"));
		employees.add(new Employee("Tamil", "tamil@gamil.com", 8397273919L, "1/47, Gandhi street, thanjavur"));
		System.out.println(employees);
	}
}