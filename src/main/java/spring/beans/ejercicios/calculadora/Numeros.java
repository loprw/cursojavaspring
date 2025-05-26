package spring.beans.ejercicios.calculadora;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Numeros {

	@Value("4")
	private int num1;
	@Value("5")
	private int num2;
	
	public Numeros() {
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}	
}
