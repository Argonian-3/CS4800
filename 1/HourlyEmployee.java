public class HourlyEmployee extends Employee {
	private int wage;
	private int hoursWorked;
	public HourlyEmployee() {
		wage = 0;
		hoursWorked = 0;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int newWage) {
		wage = newWage;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int newHoursWorked) {
		hoursWorked = newHoursWorked;
	}
	public String getIncome() {
		return wage+"";
	}
}