public class CargoShip extends Ship {
	private int tonnage;
	public CargoShip() {
		tonnage = 0;
	}
	public CargoShip(String newName, String newYear) {
		super.setName(newName);
		super.setYearBuilt(newYear);
		tonnage=0;
	}
	public int getTonnage() {
		return tonnage;
	}
	public void setTonnage(int newTonnage) {
		tonnage = newTonnage;
	}
	public String toString() {
		return super.getName()+" "+tonnage;
	}
}