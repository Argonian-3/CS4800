public class Employee {
	protected String firstName;
	protected String lastName;
	protected String socialSecurityNumber;
	public Employee() {
		firstName = "";
		lastName = "";
		socialSecurityNumber = "";
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
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String newSocialSecurityNumber) {
		socialSecurityNumber = newSocialSecurityNumber;
	}
}