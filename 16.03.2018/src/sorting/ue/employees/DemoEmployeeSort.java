package sorting.ue.employees;

import java.util.Arrays;

public class DemoEmployeeSort {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Hansi",  "BuAsw", 20, 1.500);
		Employee e2 = new Employee("Jürgen",  "BuMotion", 45, 2000);
		Employee e3 = new Employee("Thomas",  "BuControls", 1, 6.500);
		
		Employee[] employees = {e1, e2, e3}; 
		
		System.out.println("Before sort"); 
		System.out.println(Arrays.toString(employees));
		
		Arrays.sort(employees);
		
		System.out.println("After sort"); 
		System.out.println(Arrays.toString(employees));
	}

}
