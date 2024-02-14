public class Textbook {
	private String title;
	private String author;
	private String publisher;
	public Textbook() {
		title="";
		author="";
		publisher="";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String newAuthor) {
		author=newAuthor;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String newPublisher) {
		publisher=newPublisher;
	}
	public String toString() {
		return title+" "+author;
	}
}