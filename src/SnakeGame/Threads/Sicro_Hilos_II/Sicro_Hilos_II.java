package SnakeGame.Threads.Sicro_Hilos_II;

public class Sicro_Hilos_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SincronizarThreds hilo1 = new SincronizarThreds();
		Segundo hilo2 = new Segundo(hilo1);
		hilo1.start();
		hilo2.start();
	
		System.out.println("Hemos terminado las tareas!!!! ");
	}

}
class SincronizarThreds extends Thread{
	public void run() {
		for(int i =0; i < 20; i++) {
			System.out.println("Comprobamos la creación de un hilo" + getName());
		}
		
	}
}
class Segundo extends Thread{
	
	public Segundo(Thread hilo) {
		this.hilo = hilo;
	}
	public void run() {
		try {
			hilo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i < 20;i++) {
			System.out.println("Este es el segundo hilo"+ getName());
		}
	}
	private Thread hilo;
}
