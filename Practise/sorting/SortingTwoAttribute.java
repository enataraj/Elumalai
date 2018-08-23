package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingTwoAttribute {

	public SortingTwoAttribute() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		Employee emp1 = new Employee("aelumalai", "cse");
		Employee emp2 = new Employee("belumalai", "cse");
		Employee emp3 = new Employee("celumalai", "cse");
		Employee emp4 = new Employee("delumalai", "it");
		Employee emp5 = new Employee("eelumalai", "it");
		Employee emp6 = new Employee("felumalai", "it");
		Employee emp7 = new Employee("gelumalai", "it");
		empList.add(emp3);
		empList.add(emp7);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp6);
		empList.add(emp5);
		empList.add(emp4);
		Collections.sort(empList);
		System.out.println(empList);

		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}

}

class Employee implements Comparable<Employee> {
	String name;
	String dept;

	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}

	@Override
	public int compareTo(Employee obj) {
		return this.name.compareTo(obj.name);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}