package Com.Java.StreamAPI;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeRepository {
	ArrayList<Employee> empList= new ArrayList<>();
	ArrayList<Department> deptList= new ArrayList<>();
	public EmployeeRepository (){
		empList.add(new Employee(1, "Raj", "Malhotra", "raj07Mal@gmail.com", "99456798", LocalDate.now(), "Aalyst", 50000, 100, new Department(10, "Sales",100)));
		empList.add(new Employee(2, "Ram", "Singh", "ram98sing@yahoo.com", "602456798", LocalDate.now(), "Software Engineer", 45000, 300, new Department(11, "Finance",200)));
		empList.add(new Employee(3, "Nitesh", "Sirvastav", "nk987Sirvastav@gamil.com", "875656798", LocalDate.now(), "System Enginner", 30000, 400, new Department(12, "Production",300)));
		empList.add(new Employee(4, "Rocky", "Rastogi", "rockysharma@yahoo.com", "10983982", LocalDate.now(), " analyst", 40000, 200, new Department(13, "Sales",300)));
		empList.add(new Employee(5, "Shayam", "Namresh", "shayam98namre@yahoo.com", "9887883982", LocalDate.now(), "junior engineer", 35000, 200, new Department(12, "Finance",200)));
		empList.add(new Employee(6, "Babu", "Bhayia", "babu345shaheb@gmail.com", "9873983982", LocalDate.now(), " analyst", 42000, 200, new Department(10, "Finance",400)));
		empList.add(new Employee(7, "Raju", "Kumar", "raju56chindi@yahoo.com", "60483982", LocalDate.now(), " junior engineer", 34000, 200, new Department(11, "Sales",200)));
	}
	public void sumOfSalary() {	
		double Sal= empList.stream().collect(Collectors.summingDouble(o->o.getSalary()));
		System.out.println(Sal);
		System.out.println("===========================================================");
	}
	public void empWithoutDept() {
	   System.out.println(empList.stream().filter(o->o.getDepartement()==null).collect(Collectors.toList()));
	   System.out.println("**********************************************************************");
	}
	public void depWithoutEmp() {
		System.err.println(deptList.stream().filter(o->o.getDepartmentName()==null).collect(Collectors.toList()));
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
	public void deptNameWithEmp() {
		Map<String, Long> rr=empList.stream().filter((emp)->emp.getDepartement() != null).collect(Collectors.groupingBy(dept->dept.getDepartement().getDepartmentName(),Collectors.counting()));
		System.out.println(rr);
		System.out.println("=========================================================");
	}
	public void empDetails() {
		for(Employee emp: empList) {
			System.out.println(emp.getFirstName());
			System.out.println(emp.getLastName());
			System.out.println(emp.getHireDate());
			System.out.println(emp.getHireDate().getDayOfWeek());
		}
		System.out.println();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
	public void seniorEmp() {
		System.out.println(empList.stream().sorted(Comparator.comparing(e1->e1.getHireDate())).findFirst());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	public void highEmpDept() {     
		Map<Department, Long> l= empList.stream().filter((e)->e.getDepartement()!=null).collect(Collectors.groupingBy(Employee::getDepartement,Collectors.counting()));
		System.out.println(l);
		System.out.println("======================================================================");
	}
	public void empWithDuration() {
		empList.stream().forEach(e -> {Period period =e.getHireDate().until(LocalDate.now());
			System.out.println("Employee Id :"+e.getFirstName()+" "+e.getLastName()+
					" == Month:-"+ChronoUnit.MONTHS.between(e.getHireDate(), LocalDate.now())
					+" == Days:-"+period.getDays());
		});
		System.out.println("***********************************************************");
	}
	public void empFriday() {
		empList.stream().filter((e)->e.getHireDate().getDayOfWeek().toString().equals("FRIDAY")).collect(Collectors.toList());
		System.out.println(empList.size());
		for(Employee emp:empList) {
			System.out.println(emp.getFirstName());
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	public void increasedSalary() {
		empList.stream().collect(Collectors.toList());
		for(Employee emp:empList) {
			System.out.println("Emp Name: "+emp.getFirstName()+ "Salary" +emp.getSalary()
			+"Salary increased: "+emp.getSalary()*1.15);
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
	public void sortEmpId(){
		List < Employee > employeesSortedList1 = empList.stream()
	            .sorted((o1, o2) -> (int)(o1.getEmployeeId() - o2.getEmployeeId())).collect(Collectors.toList());
	 employeesSortedList1.forEach(obj->System.out.println(obj));
	 System.out.println("==================================================================");
	}
	public void sortDept(){
		 List < Employee > employeesSortedList2 = empList.stream()
		            .sorted((o1, o2) -> (int)(o1.getDepartement().getDepartmentId() - o2.getDepartement().getDepartmentId())).collect(Collectors.toList());
		 employeesSortedList2.forEach(obj->System.out.println(obj));
		 System.out.println("-------------------------------------------------------------------------------");
	}
	public void sortByFirstName(){
		List < Employee > employeesSortedList3 = empList.stream()
	            .sorted((o1, o2) -> (int)(o1.getFirstName().compareTo( o2.getFirstName()))).collect(Collectors.toList());
	 employeesSortedList3.forEach(obj->System.out.println(obj)); 
	 System.out.println("--------------------------------------------------------------------------------");
	}
	public void reportManager() {
		 List<Employee>ch = empList.stream().filter(o->o.getManagerId()!=null).toList();
		 for(int i =0;i<ch.size();i++) {
			 Employee e3=ch.get(i);
			 System.out.println("the employee name"+" "+e3.getFirstName()+" ---> "+"\t"+ "the reporting manager  "+" "+ e3.getManagerId());
		 }
		 System.out.println("-----------------------------------------------------------------------------");
	}
	public void empWithoutManager() {
		System.out.println(empList.stream().filter(e->e.getManagerId()==null));
		System.out.println("===================================================================================");
	}
}
