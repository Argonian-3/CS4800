public class File {
	protected String name;
	public File() {
		name="";
	}
	public File(String newName) {
		name=newName;
	}
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name=newName;
	}
	public String toString() {
		return name;
	}
	public void print(){
		System.out.print(name);
	}
}