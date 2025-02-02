package by.using.map.interfaceinStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class EmpMain_FindOutSalmorethanThirtand_AddSal {

	
	
	/*
	 * From the given list of employees findout the salary of employee who getting 
	 * 30k salary and add with there salary by 5k 
	 */
	public static void main(String[] args) {
	
		
		List<Employee> EmployeeList = new ArrayList<Employee>();
		EmployeeList.add(new Employee(121, "Surya", 24,30000.0));
		EmployeeList.add(new Employee(104, "Sipu", 19,12000.9));
		EmployeeList.add(new Employee(99, "biki",34,94444.9));
		EmployeeList.add(new Employee(122, "Lipu", 26,56666.6));
		EmployeeList.add(new Employee(134, "sibu", 13,24000.6));
		EmployeeList.add(new Employee(151, "praksh", 34,1000.0));
		EmployeeList.add(new Employee(174, "omm", 55,2922.0));
		EmployeeList.add(new Employee(135, "sani",56, 22554.4));
		EmployeeList.add(new Employee(11, "supi", 21,9889.9));
		EmployeeList.add(new Employee(171, "lucky", 11,2333.4));
		EmployeeList.add(new Employee(121, "digina", 27,49943.9));
		EmployeeList.add(new Employee(17, "dibya", 29,94403.0));
		EmployeeList.add(new Employee(1781, "para", 57,94493.9));
		EmployeeList.add(new Employee(135, "anish", 49,994.4));
		EmployeeList.add(new Employee(1, "lantu", 16,4994.4));
		EmployeeList.add(new Employee(81, "litu", 19,413.3));
		EmployeeList.add(new Employee(31, "sonu", 10,3733.3));
		EmployeeList.add(new Employee(701, "sonu", 92,38883.3));
		EmployeeList.add(new Employee(801, "fakira", 56, 3848.4));
		
		List<Employee> collect11 = EmployeeList.stream()
				.map(
						
						e->{
							if(e.getEmpSal()==30000) {
								e.setEmpSal(e.getEmpSal()+5000);
							}
							return e;
						})
						.collect(Collectors.toList());
		
		collect11.forEach(System.out::println);
		

		System.out.println("==========================");
		//or
		
		System.out.println(collect11);

		//or
		
		System.out.println("==========================");
		
		for(Employee e2 : collect11) {
			
			System.out.println(e2);
		}
	}

}
