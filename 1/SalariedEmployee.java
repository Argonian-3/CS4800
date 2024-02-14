public class SalariedEmployee extends Employee {
	private int weeklySalary;
	public SalariedEmployee() {
		super();
		weeklySalary = 0;
	}
	public int getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(int newWeeklySalary) {
		weeklySalary = newWeeklySalary;
	}
	public String getIncome() {
		return weeklySalary+"";
	}
}