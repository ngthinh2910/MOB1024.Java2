package entity;

public class Employee {
	private String id;
	private String name;
	private double basicSalary;
	
	public Employee() {}
	
	public Employee(String id, String name, double basicSalary) {
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	public String getId() {
		return id;
	}

	public boolean setId(String id) {
		if (id != "") {
			this.id = id;
			return true;
		}else {
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public boolean setBasicSalary(double basicSalary) {
		if (basicSalary >= 0) {
			this.basicSalary = basicSalary;
			return true;
		}else {
			return false;
		}
	}
	
	public double inCome() {
		return this.basicSalary;
	}
	
	@Override
	public String toString() {
		return "Employee: ID: "+id+ " | " + "Name: "+name +" | "+"Salary: "+ inCome();
	}
}
