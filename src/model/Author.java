package model;

public class Author {
	private String name;
	private String lastName;
	
	public Author(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return name + " " + lastName;
	}
	
	public String getFullName() {
		return this.toString();
	}
	
	public String getBibliographicCitation() {
		return (this.lastName + ", " + this.name.substring(0, 1) + ". ").toUpperCase().trim();
	}
}
