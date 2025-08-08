package ganesh1;

class Book{
	String title;
	String author;
	double price;
	public Book(String title,String author,double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void displayDetails() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
}
class EBook extends Book{
	double filesizeMB;
	EBook(String title,String author,double price,double filesizeMB){
		super(title,author,price);
		this.filesizeMB = filesizeMB;
	}
	void displayDetails() {
		super.displayDetails();
		System.out.println("File Size: " + filesizeMB);
	}
}
class PrintedBook extends Book{
	int numberofPages;
	PrintedBook(String title,String author,double price,int numberofPages){
		super(title,author,price);
		this.numberofPages = numberofPages;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Number fo Pages: " + numberofPages);
	}
}
public class BookDetails {
	public static void main(String[] args) {
		EBook ebook = new EBook("Interstellar","Christopher Nolan",100,500);
		ebook.displayDetails();
		System.out.println("\n");
		PrintedBook print = new PrintedBook("Avatar","James Camroen",400,530);
		print.displayDetails();
	}
}
