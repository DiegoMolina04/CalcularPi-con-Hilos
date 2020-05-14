package Threads3;

public class Suma3 extends Thread{
	
	public Suma3(String msg) {
		super(msg);
	}
	
	public void run() {
		
		int count = 1000000;
		double denominador = 1.0;
		double resultadoSuma = 0.0;
		
		for (int x = 0; x < count; x++) {
			resultadoSuma = resultadoSuma + (1 / denominador);
			denominador = denominador + 4;
			
		}
		Main3 objSuma = new Main3(resultadoSuma);
	}
	
}
