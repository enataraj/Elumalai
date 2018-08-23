package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChainedComparatorMain {

	public ChainedComparatorMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		List<Employee1> empList = new ArrayList<>();
		Employee1 emp1 = new Employee1("aelumalai", "cse");
		Employee1 emp2 = new Employee1("belumalai", "it");
		Employee1 emp3 = new Employee1("celumalai", "cse");
		Employee1 emp4 = new Employee1("delumalai", "it");
		Employee1 emp5 = new Employee1("eelumalai", "mech");
		Employee1 emp6 = new Employee1("felumalai", "cse");
		Employee1 emp7 = new Employee1("gelumalai", "it");
		empList.add(emp3);
		empList.add(emp7);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp6);
		empList.add(emp5);
		empList.add(emp4);
		Collections.sort(empList, new ChainedComparator());
//		System.out.println(empList);

		for (Employee1 emp : empList) {
			System.out.println(emp);
		}

	}
}

class Employee1 {
	String name;
	String dept;

	public Employee1(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return this.name + "\t" + this.dept;
	}

}