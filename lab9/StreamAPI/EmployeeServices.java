package Com.Java.StreamAPI;

public class EmployeeServices {
	public static void main(String[] args) {
		EmployeeRepository er=new EmployeeRepository();
		er.sumOfSalary();
		er.deptNameWithEmp();
		er.seniorEmp();
		er.empWithDuration();
		er.empWithoutDept();
		er.depWithoutEmp();
		er.highEmpDept();
		er.empDetails();
		er.empFriday();
		er.increasedSalary();
		er.empWithoutManager();
		er.reportManager();
		er.sortEmpId();
		er.sortDept();
		er.sortByFirstName();
		}
}
