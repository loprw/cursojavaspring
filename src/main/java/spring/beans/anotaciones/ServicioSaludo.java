package spring.beans.anotaciones;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("saludo")
@Scope(scopeName = "prototype")
public class ServicioSaludo {
    public void saludar() {
        System.out.println("¡Hola desde un bean de Spring!");
    }
}