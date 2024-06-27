package SetterWithCollection;

public class Answer {
 String name;
 String author;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
@Override
public String toString() {
	return "Answer [name=" + name + ", author=" + author + "]";
}
 
 

}
