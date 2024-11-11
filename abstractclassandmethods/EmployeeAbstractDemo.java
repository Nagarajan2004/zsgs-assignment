package abstractclassandmethods;

abstract class Employee{
	private final int employeeId;
	private String employeeName;
	private String email;
	private long phoneNumber;
	String employeeType;
	static int emp_id = 0;
	
	Employee(String name, String email, long phoneNumber){
		this.employeeId = ++emp_id;
		this.employeeName = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	abstract double calculatePay();
	
	void getEmployeeDetails() {
		System.out.println("Employee Type: "+employeeType + "\n" +
							"Employee Id: "+employeeId + "\n" +
							"Name: "+employeeName + "\n" +
							"email: "+email + "\n" +
							"phone Number: "+phoneNumber+ "\n" +
							"salary: "+calculatePay() + "\n"
							);
	}
}

class HourlyEmployee extends Employee{
	private double oneHoursalary = 500;
	private int hoursWorked;
	
	HourlyEmployee(String name, String email, long phoneNumber, int hours){
		super(name, email, phoneNumber);
		this.hoursWorked = hours;
		super.employeeType = "Hourly";
	}
	
	@Override
	double calculatePay() {
		return hoursWorked * oneHoursalary;
	}
	
}

class SalariedEmployee extends Employee{
	private double salary = 50000;
	
	SalariedEmployee(String name, String email, long phoneNumber){
		super(name, email, phoneNumber);
		super.employeeType = "salaried";
	}
	
	@Override
	double calculatePay() {
		return salary;
	}
	
}

public class EmployeeAbstractDemo {
	public static void main(String[] args) {
		Employee emp1 = new HourlyEmployee("karthi", "karthi@gmail.com", 8459387473L, 8);
		Employee emp2 = new SalariedEmployee("hari", "hari@gmail.com", 9876587473L);
		emp1.getEmployeeDetails();
		emp2.getEmployeeDetails();
	}
}
