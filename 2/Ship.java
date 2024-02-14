public class Ship {
	private String name;
	private String yearBuilt;
	public Ship() {
		name = "";
		yearBuilt = "";
	}
	public Ship(String newName, String newYear) {
		setName(newName);
		setYearBuilt(newYear);
	}
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public String getYearBuilt() {
		return yearBuilt;
	}
	public void setYearBuilt(String newYear) {
		yearBuilt = newYear;
	}
	public String toString() {
		return name + " " + yearBuilt;
	}
	public void print() {
		System.out.println(this.toString());
	}
}