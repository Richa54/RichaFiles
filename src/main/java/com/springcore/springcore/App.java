package com.springcore.springcore;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;   
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
      //=new  ClassPathXMLApplicationContect("com\\Config.xml");
        ApplicationContext  context = new ClassPathXmlApplicationContext("com/springcore/springcore/AppConfig.xml");
        Student s1=(Student)context.getBean("student");
        System.out.println(s1);
    }
}
