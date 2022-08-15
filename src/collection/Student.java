package collection;

public class Student {
	private Integer rollNo;
	private String name;
	private Double percentage;
	
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	public Student(Integer rollNo, String name, Double percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}
	
	Student(){}
	@Override
	public String toString() {
		return "\n Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	
}
