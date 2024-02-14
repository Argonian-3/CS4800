public class CruiseShip extends Ship {
	private int maximumPassengers;
	public CruiseShip() {
		maximumPassengers=0;
	}
	public CruiseShip(String newName, String newYear) {
		super.setName(newName);
		super.setYearBuilt(newYear);
		maximumPassengers=0;
	}
	public int getMaxPassengers() {
		return maximumPassengers;
	}
	public void setMaxPassengers(int newMax) {
		maximumPassengers = newMax;
	}
	public String toString() {
		return super.getName()+" "+maximumPassengers;
	}
}