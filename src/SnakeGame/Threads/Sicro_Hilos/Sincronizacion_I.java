package Sicro_Hilos;

public class Sincronizacion_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SincronizarThreds hilo1 = new SincronizarThreds();
		SincronizarThreds hilo2 = new SincronizarThreds();
		//Segundo hilo3 = new Segundo();
		hilo1.start();
		try {
			hilo1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hilo2.start();
		// El encapsulado del método sleep no tiene ninguna función especial. En realidad es para poder visioanr la impresión por terminal más lenta.
		try {
			hilo2.sleep(500000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//hilo3 .start();
		
		

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
	public void run() {
		for(int i = 0; i < 20;i++) {
			System.out.println("Este es el segundo hilo"+ getName());
		}
	}
}
