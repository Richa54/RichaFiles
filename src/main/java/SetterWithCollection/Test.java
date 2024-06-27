package SetterWithCollection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("SetterWithCollection/CollectionConfig.xml");
		Question q1=(Question)context.getBean("question");
		q1.display();
		
		

	}

}
