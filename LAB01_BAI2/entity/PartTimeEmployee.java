package entity;

public class PartTimeEmployee extends Employee{
	private double workingHours;
	private double hourlyRate;
	
	public PartTimeEmployee(String id, String name, double basicSalary, double workingHours, double hourlyRate) {
		super(id, name, basicSalary);
		this.workingHours = workingHours;
		this.hourlyRate = hourlyRate;
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public boolean setWorkingHours(double workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
			return true;
		}else {
			return false;
		}
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public boolean setHourlyRate(double hourlyRate) {
		if (hourlyRate >= 0) {
			this.hourlyRate = hourlyRate;
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public double inCome() {
		return this.workingHours*this.hourlyRate;
	}
	
	@Override
	public String toString() {
		return "PartTimeEmployee: ID: "+super.getId()+"| Name: " +super.getName()+"|Income: "+inCome()+"|WorkingHours: "+getWorkingHours()+"| HourlyRate: "+getHourlyRate();
	}
	
}
