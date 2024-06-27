package AutowiringDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("AutowiringDemo/AutoConfig.xml");
		A a1=(A)context.getBean("a");
		a1.display();

	}

}
