package SetterWithMapping;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {
  int employeeCode;
  Map<User,Address> info;
public int getEmployeeCode() {
	return employeeCode;
}
public void setEmployeeCode(int employeeCode) {
	this.employeeCode = employeeCode;
}
public Map<User, Address> getInfo() {
	return info;
}
public void setInfo(Map<User, Address> info) {
	this.info = info;
}
  
  void display()
  {
	  System.out.println("Employee Code : "+employeeCode);
	  Set<Entry<User,Address>> set= info.entrySet();
	  Iterator it=set.iterator();
	  while(it.hasNext())
	  {
		  Entry<User,Address> entry=(Entry<User, Address>) it.next();  
	       User user=entry.getKey();  
	       Address address=entry.getValue();  
	        System.out.println("Address Information:");  
	        System.out.println(address);  
	        System.out.println("Posted By:");  
	        System.out.println(user);  
	  }
	  
  }
}
