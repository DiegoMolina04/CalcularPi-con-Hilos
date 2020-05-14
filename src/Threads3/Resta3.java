package Threads3;

public class Resta3 extends Thread{
	
	public Resta3(String msg) {
		super(msg);
	}
	
	public void run() {
		
		int count = 1000000;
		double denominador = 3.0;
		double resultadoResta = 0.0;
		
		for (int x = 0; x < count; x++) {
			resultadoResta = resultadoResta - (1 / denominador);
			denominador = denominador + 4;
		}
		//System.out.println("Resultado: "+resultadoResta);
		Main3 objResta = new Main3(resultadoResta);
	}
}
