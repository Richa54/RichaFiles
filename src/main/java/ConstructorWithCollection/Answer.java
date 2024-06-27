package ConstructorWithCollection;

public class Answer {

	int id;
	String name;
	String author;
	public Answer(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	
}
