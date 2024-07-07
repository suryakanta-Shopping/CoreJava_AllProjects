package java27th.june.streamAPIInterview.bits;

import java.util.Objects;

public class Person {


	private Integer perId;
	
	private String perName;

	private Integer perAge;

	public Integer getPerId() {
		return perId;
	}

	public void setPerId(Integer perId) {
		this.perId = perId;
	}

	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	public Integer getPerAge() {
		return perAge;
	}

	public void setPerAge(Integer perAge) {
		this.perAge = perAge;
	}

	@Override
	public int hashCode() {
		return Objects.hash(perAge, perId, perName);
	}

	
	public Person(Integer perId, String perName, Integer perAge) {
		super();
		this.perId = perId;
		this.perName = perName;
		this.perAge = perAge;
	}

	@Override
	public String toString() {
		return "Person [perId=" + perId + ", perName=" + perName + ", perAge=" + perAge + "]";
	}
	
}
