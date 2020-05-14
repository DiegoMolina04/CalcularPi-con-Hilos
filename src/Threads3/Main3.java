package Threads3;

public class Main3 extends Thread{
	
	public static double pi = 0.0;
	
	public Main3(double a) {
		
		pi = pi+a;
		//System.out.println("Pi ahora es :"+pi);
		
	}
	
	public Main3(String msg) {
		super(msg);
	}
	
	public void run() {
		pi = pi*4;
		System.out.println("El valor de pi es :"+pi);
	}

	public static void main(String[] args) {
		
		Thread hilo = new Suma3("Proceso 1");
		Thread hilo2 = new Resta3("Proceso 2");
		Thread hilo3 = new Main3("Proceso 3");
		
		try {
			hilo2.start();
			hilo.sleep(3802);//5000
			hilo.start();
			hilo3.sleep(280);//10000
			hilo3.start();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
