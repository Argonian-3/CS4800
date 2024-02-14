public class CourseDriver {
	public static void main(String[] args) {
		Course cs4800 = new Course("CS4800");
		Instructor nima = new Instructor();
		nima.setFirstName("Nima");
		nima.setLastName("Davarpanah");
		nima.setOfficeNumber("3-2636");
		cs4800.addInstructor(nima);
		Textbook cleanCode = new Textbook();
		cleanCode.setTitle("Clean Code");
		cleanCode.setAuthor("Robert C. Martin");
		cleanCode.setPublisher("Prentice Hall");
		cs4800.addTextbook(cleanCode);
		Instructor john = new Instructor();
		john.setFirstName("John");
		john.setLastName("Professor");
		john.setOfficeNumber("1-2345");
		cs4800.addInstructor(john);
		Textbook designPatterns = new Textbook();
		designPatterns.setTitle("Design Patterns");
		designPatterns.setAuthor("Erich Gamma");
		designPatterns.setPublisher("Addison-Wesley");
		cs4800.addTextbook(designPatterns);
		cs4800.print();
	}
}