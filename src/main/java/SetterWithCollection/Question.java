package SetterWithCollection;

import java.util.Iterator;
import java.util.List;

public class Question {
       
	String name;
	List<Answer> answer;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Name:"+name);
		Iterator it=answer.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
