public class BaseEmployee extends Employee {
	private int baseSalary;
	public BaseEmployee() {
		baseSalary = 0;
	}
	public int getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(int newBaseSalary) {
		baseSalary = newBaseSalary;
	}
	public String getIncome() {
		return baseSalary+"";
	}
}