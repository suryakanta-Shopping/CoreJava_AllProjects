package by.using.map.interfaceinStream;

import java.util.Objects;

public class Employee {

private Integer empId;
	
	private String empName;

	private Integer empAge;
	
	private Double empSal;

	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	public Employee(Integer empId, String empName, Integer empAge, Double empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSal=" + empSal + "]";
	}

}
