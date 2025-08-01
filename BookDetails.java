package Test;
class Book{
	String title;
	String author;
	final int bookID;
	static int bookCounter = 1000;
	static final String LIBRARY_NAME= "Central Library";
	Book(){
		title = "Not assigned";
		author = "None";
		bookID = bookCounter;
	}
	Book(String title,String author){
		this.title = title;
		this.author = author;
		bookCounter++;
		bookID = bookCounter;
	}
	void displayInfo() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Book ID: " + bookID);
	}
	void displayInfo(boolean showLibrary) {
		if(showLibrary) {
			System.out.println("Library name: " + LIBRARY_NAME);
		}
	}
	public static void displayTotalBooks() {
		System.out.println("Total Number of Books: " + bookCounter);
	}
}

public class BookDetails {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.displayInfo();
		Book book2 = new Book("Home","John");
		book2.displayInfo();
		Book book3 = new Book("Away","Doe");
		book2.displayInfo();
		Book.displayTotalBooks();
	}

}
