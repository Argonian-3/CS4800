import java.util.List;
import java.util.LinkedList;
public class Course {
	private List<Instructor> instructors;
	private List<Textbook> textbooks;
	private String name;
	public Course() {
		instructors = new LinkedList<>();
		textbooks=new LinkedList<>();
		name="";
	}
	public Course(String newName) {
		instructors = new LinkedList<>();
		textbooks=new LinkedList<>();
		name=newName;
	}
	public void addInstructor(Instructor newInstructor) {
		instructors.add(newInstructor);
	}
	public void addTextbook(Textbook newTextbook) {
		textbooks.add(newTextbook);
	}
	public String toString() {
		String instructorText = instructors.toString();
		instructorText = instructorText.substring(1,instructorText.length()-1);
		String textbookText = textbooks.toString();
		textbookText=textbookText.substring(1,textbookText.length()-1);
		return name+"\n"+instructorText+"\n"+textbookText;
	}
	public void print() {
		System.out.println(this);
	}
}