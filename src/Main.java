import model.Author;
import model.Book;

public class Main {

	public static void main(String[] args) {
		Book javaBook = new Book("Mastering Java Machine Learning");
		javaBook.setPublisher("Packt Publishing");
		javaBook.setYear(2017);
		Author kamath = new Author("Uday", "Kamath");
		Author choppella = new Author("Krishna", "Choppella");
		javaBook.addAuthor(kamath);
		javaBook.addAuthor(choppella);
		Book networkBook = new Book("Computer Networks 5th Edition", "Pearson", 2010);
		Author tanenbaum = new Author("Andrew", "Tanenbaum");
		networkBook.addAuthor(tanenbaum);
		javaBook.printCatalogSheet();
		networkBook.printCatalogSheet();
		System.out.println();
	}

}
