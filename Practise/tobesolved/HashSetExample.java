package tobesolved;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		String str1 = new String("elumalai");
		String str2 = new String("elumalai");
		String str3 = new String("Elumalai");
		String str4 = str1;

		HashSet<String> hs = new HashSet<>();
		hs.add(str1);
		hs.add(str2);
		hs.add(str3);
		hs.add(str4);
		System.out.println("HashSet String: " + hs);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());

		Employee e1 = new Employee("Elumalai", 34);
		Employee e2 = new Employee("Elumalai", 34);
		Employee e3 = new Employee("Elumalai", 34);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());

		HashSet<Employee> hsE = new HashSet<>();
		hsE.add(e1);
		hsE.add(e2);
		hsE.add(e3);

		System.out.println("Emplo : " + hsE);

		String o1 = "elumalai";
		String o2 = new String("elumalai");

		HashSet<String> ss = new HashSet<>();
		ss.add(o1);
		ss.add(o2);
		System.out.println(ss);

	}

}

class Employee {
	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;

	}
}
