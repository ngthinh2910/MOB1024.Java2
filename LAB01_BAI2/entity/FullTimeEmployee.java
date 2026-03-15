package entity;

public class FullTimeEmployee extends Employee{
	private double bonus;
	private double penalty;
	
	public FullTimeEmployee(String id, String name, double basicSalary, double bonus, double penalty) {
		super(id, name, basicSalary);
		this.bonus = bonus;
		this.penalty = penalty;
	}

	public double getBonus() {
		return bonus;
	}

	public boolean setBonus(double bonus) {
		if (bonus >= 0) {
			this.bonus = bonus;
			return true;
		}else {
			return false;
		}
		
	}

	public double getPenalty() {
		return penalty;
	}

	public boolean setPenalty(double penalty) {
		if (penalty >= 0) {
			this.penalty = penalty;
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public double inCome() {
		return super.getBasicSalary() + this.bonus + this.penalty;
	}
	
	@Override
	public String toString() {
		return "FullTimeEmp: ID: "+super.getId() +"|Name: "+super.getName()+"|Income: "+inCome()+"|Bonus: "+bonus+"|Penalty: "+penalty; 
	}
	
}
