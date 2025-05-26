package spring.beans.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InversionControl_1 {

	public static void main(String args[]){
		System.out.println("Arranco");
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		System.out.println("Accedo al objeto");
		HelloWorld obj=(HelloWorld)context.getBean("helloWorld3");
		obj.getMessage();

	}
}
