package SetterRefInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("SetterRefInjection/SetterConfig.xml");
		Person p1=(Person)context.getBean("person");
		System.out.println(p1);

	}

}
