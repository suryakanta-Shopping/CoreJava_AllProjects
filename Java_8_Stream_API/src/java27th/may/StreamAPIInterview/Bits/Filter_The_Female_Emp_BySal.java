package java27th.may.StreamAPIInterview.Bits;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_The_Female_Emp_BySal {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("ss", "female", 23399));
		emp.add(new Employee("pp", "male", 1000));
		emp.add(new Employee("Np", "male", 20200));
		emp.add(new Employee("kk", "female", 4000));
		emp.add(new Employee("rr", "male", 23));
		emp.add(new Employee("yu", "female", 234));
		emp.add(new Employee("oo", "male", 30000));
		emp.add(new Employee("pp", "female", 45555));
		emp.add(new Employee("hk", "female", 27777));
		emp.add(new Employee("slp", "male", 253));
		emp.add(new Employee("sskg", "male", 2355));

		List<Employee> result = emp.stream()
				.filter(emps -> "Female".equalsIgnoreCase(emps.getGender()) && emps.getSalary() > 200)
				.sorted((e1, e2) -> e2.getName().compareTo(e1.getName())).collect(Collectors.toList());
		


		result.forEach(System.out::println);

	}

}
