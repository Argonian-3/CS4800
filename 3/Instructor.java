public class Instructor {
	private String firstName;
	private String lastName;
	private String officeNumber;
	public Instructor() {
		firstName="";
		lastName="";
		officeNumber="";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	public String getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(String newOfficeNumber) {
		officeNumber = newOfficeNumber;
	}
	public String toString() {
		return firstName+" "+lastName;
	}
}