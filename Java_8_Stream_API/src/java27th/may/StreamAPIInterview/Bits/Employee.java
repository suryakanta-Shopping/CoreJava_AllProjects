package java27th.may.StreamAPIInterview.Bits;

public class Employee {

	private String name;
	private String gender;
	private Double salary;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}

	public Employee(String string1, String string2, double i) {
		super();
		// TODO Auto-generated constructor stub
	}

}
