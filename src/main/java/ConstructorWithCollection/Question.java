package ConstructorWithCollection;

import java.util.Iterator;
import java.util.List;

public class Question {
	
	int id;
	String name;
	
	List<Answer> answer;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int id, String name, List<Answer> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	
	void display()
	{
		System.out.println("Name : "+ name+" Id : "+id);
		Iterator <Answer> it=answer.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
	}

}
