package MapConstructor;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;  
import java.util.Set;  


public class Question {
  int id;
  String value;
  Map <Answer, User> answers;
public Question() {
	super();
	// TODO Auto-generated constructor stub
}
public Question(int id, String value, Map<Answer, User> answers) {
	super();
	this.id = id;
	this.value = value;
	this.answers = answers;
}
 
void display()
{
	System.out.println("Name : "+ value+" Id : "+id);
	
	Set<Entry<Answer, User>> set=answers.entrySet();  
	 
	Iterator <Entry<Answer, User>>it=set.iterator();
	
	while(it.hasNext())
	{
		 Entry<Answer, User> entry=it.next();  
	        Answer ans=entry.getKey();  
	        User user=entry.getValue();  
	        System.out.println("Answer Information:");  
	        System.out.println(ans);  
	        System.out.println("Posted By:");  
	        System.out.println(user);  
	}

}
  
  
}
