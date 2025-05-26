package spring.beans.ejercicios.calculadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

	@Autowired
	private Numeros nums;

	public CalculadoraService() {
	}

	public Numeros getNums() {
		return nums;
	}

	public void setNums(Numeros nums) {
		this.nums = nums;
	}

	public int operar(String operacion) {
		
		int resultado = 0;
		
		switch (operacion) {
			case "+" -> {
				resultado = nums.getNum1() + nums.getNum2();
			}
			case "-" -> {
				resultado = nums.getNum1() - nums.getNum2(); 
			}
		}
		
		return resultado;
	}
}
