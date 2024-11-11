package methodoverriding;

import java.util.ArrayList;
import java.util.List;

import classesandobjects.Employee;

class HourlyEmployee extends Employee{
	public HourlyEmployee(String name, String email, long phoneNumber, String address, String employeeType) {
		super(name, email, phoneNumber, address);
		setEmployee_type(employeeType);
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + getEmployee_id() + ", employee_name=" + getEmployee_name() + ", email=" + getEmail()
				+ ", phoneNumber=" + getPhoneNumber() + ", address=" + getAddress() +", employee_type="+ getEmployee_type() +"]\n";
	}
}

class SalariedEmployee extends Employee{
	public SalariedEmployee(String name, String email, long phoneNumber, String address, String employeeType) {
		super(name, email, phoneNumber, address);
		setEmployee_type(employeeType);
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + getEmployee_id() + ", employee_name=" + getEmployee_name() + ", email=" + getEmail()
				+ ", phoneNumber=" + getPhoneNumber() + ", address=" + getAddress() +", employee_type="+ getEmployee_type() +"]\n";
	}
}

public class EmployeeDetails {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new HourlyEmployee("Tamil", "tamil@gamil.com", 8397273919L, "20-1, 2nd street, madurai", "Hourly"));
		employees.add(new SalariedEmployee("Arun", "arun@gamil.com", 9997233919L, "22, 2nd floor, 5th street, chennai", "Salary"));
		System.out.println(employees);
	}
}
