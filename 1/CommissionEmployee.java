public class CommissionEmployee extends Employee {
	private int commissionRate;
	private int grossSales;
	public CommissionEmployee() {
		commissionRate = 0;
		grossSales = 0;
	}
	public int getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(int newCommissionRate) {
		commissionRate = newCommissionRate;
	}
	public int getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(int newGrossSales) {
		grossSales = newGrossSales;
	}
}
