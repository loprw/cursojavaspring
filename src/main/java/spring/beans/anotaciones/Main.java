package spring.beans.anotaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ServicioSaludo saludo = context.getBean(ServicioSaludo.class);
        ServicioSaludo saludo2 = (ServicioSaludo) context.getBean("saludo");
        saludo.saludar();
        saludo2.saludar();
    }
}