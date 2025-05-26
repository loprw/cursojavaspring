package spring.beans.ejercicios.calculadora;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Controlador contr = (Controlador) context.getBean("controller");
		System.out.println(contr.ejecutarOperacion());
	}

}
