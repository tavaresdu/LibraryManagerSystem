package model;

import java.util.HashSet;
import java.util.Set;

public class Book {
	private String title;
	private String publisher;
	private int year;
	private Set<Author> authors;
	
	private Book() {
		this.authors = new HashSet<Author>();
	}
	
	public Book(String title) {
		this();
		this.title = title;
	}
	
	public Book(String title, String publisher, int year) {
		this();
		this.title = title;
		this.publisher = publisher;
		this.year = year;
		this.authors = new HashSet<Author>();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Set<Author> getAuthors() {
		return authors;
	}
	
	public void addAuthor(Author author) {
		this.authors.add(author);
	}
	
	public void printCatalogSheet() {
		String string = "";
		for (Author author : authors)
			string += author.getBibliographicCitation() + " ";
		if (this.year != 0)
			string += "(" + this.year + ") ";
		string += this.title + ". ";
		if (this.publisher != null)
			string += this.publisher + ", ";
		if (this.year != 0)
			string += this.year + ".";
		System.out.println(string);
	}
	
	public void listAuthors() {
		for (Author author : this.authors) {
			System.out.println(author.getFullName());
		}
	}
	
	public Author searchAuthor(String authorFullName) {
		for (Author author : this.authors)
			if (author.toString().equals(authorFullName))
				return author;
		return null;
	}
	
	public boolean removeAuthor(String authorFullName) {
		Author author = this.searchAuthor(authorFullName);
		if (author != null)
			return this.authors.remove(author);
		else
			return false;
	}
}
