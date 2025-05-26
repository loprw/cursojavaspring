package spring.beans.ejercicios.calculadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("controller")
public class Controlador {

	@Value("+")
	private String operacion;
	@Autowired
	private CalculadoraService service;
	
	public Controlador() {
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public CalculadoraService getService() {
		return service;
	}

	public void setService(CalculadoraService service) {
		this.service = service;
	}
	
	public int ejecutarOperacion() {
		int resultado = service.operar(operacion);
		
		return resultado;
	}
}
