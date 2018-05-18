package sorting.ue.employees;

public class Employee implements Comparable<Employee>{

	private String name, department; 
	private int empNumber; 
	private double salary;
	public Employee(String name, String department, int empNumber, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.empNumber = empNumber;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getEmpNumber() {
		return empNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empNumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empNumber != other.empNumber)
			return false;
		return true;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empNumber=" + empNumber + "]";
	}
	@Override
	public int compareTo(Employee o) {
		if (getEmpNumber() > o.getEmpNumber()) return 1; 
		if(getEmpNumber() == o.getEmpNumber()) return 0; 
		return -1; 
	}
	
	
	
	
	
	
}
