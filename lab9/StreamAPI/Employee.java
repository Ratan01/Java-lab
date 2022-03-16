package Com.Java.StreamAPI;

import java.time.LocalDate;

public class Employee {
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String phoneNumber;
	private LocalDate hireDate;
	private String degination;
	private double salary;
	private Integer managerId;
	private Department department;
			
	public Employee(Integer employeeId, String firstName, String lastName, String emailId, String phoneNumber,
			LocalDate hireDate, String degination, double salary, Integer managerId, Department department) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.degination = degination;
		this.salary = salary;
		this.managerId = managerId;
		this.department = department;
	}
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDegination() {
		return degination;
	}
	public void setDegination(String degination) {
		this.degination = degination;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public Department getDepartement() {
		return department;
	}
	public void setDepartement(Department departement) {
		this.department = departement;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", degination="
				+ degination + ", salary=" + salary + ", managerId=" + managerId + ", department=" + department + "]";
	}
}
