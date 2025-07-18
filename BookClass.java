package lab;

class Book {
	String title;
	String author;
	double price;
	Book() {
		title="Unknown";
		author="Not Assigned";
		price=0.0;
	}
	void displayDetails() {
		System.out.println("Title :" + title);
		System.out.println("Author :" + author);
		System.out.println("Price :" + price);
	}
}
public class BookClass {
	public static void main(String[] args) {
		Book book= new Book();
		book.displayDetails();
	}
}


