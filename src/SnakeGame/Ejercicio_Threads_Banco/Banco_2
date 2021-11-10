import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ejercicio_Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco b = new Banco();
		for (int i =0;i <100;i++) {
			EjecutandoTransferencias r = new EjecutandoTransferencias(b,i,2000);
			Thread t = new Thread(r);
			t.start();
		}

	}

}
class Banco{
	
	public Banco() {
		cuentas = new double[100];
		for(int i =0; i < 100; i++) {
			cuentas[i]= 2000;
		}

	}
	
	public void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) {
		bloqueaBanco.lock();
		try {
			if(cuentas[cuentaOrigen]< cantidad) return; //Evita la transferencia por falta de efectivo de la cuenta origen
			System.out.println(Thread.currentThread());//Esto nos va a informar de cual es el hilo que está ejecutandose
			cuentas[cuentaOrigen]-=cantidad;
			System.out.printf("%10.2f de %d para la cuenta %d",cantidad,cuentaOrigen,cuentaDestino);
			System.out.println("");
			cuentas[cuentaDestino]+=cantidad;
			
			//System.out.println(cantidad + " €  de la cuenta: " + cuentaOrigen + " a la cuenta: " + cuentaDestino );
			//Existe otra forma de sacar la info general de la operaciones
			
			//System.out.println(getSaldoTotal());
			System.out.printf("Saldo total: %10.2f%n", getSaldoTotal());
		}finally {
			bloqueaBanco.unlock();
		}
	}
	public double getSaldoTotal() {
		double sumaSaldoBanco= 0;
		for(double a : cuentas) {
			sumaSaldoBanco += a;
		}
		return sumaSaldoBanco;
		
	}

	private final double cuentas[];
	private Lock bloqueaBanco = new ReentrantLock();
}

class EjecutandoTransferencias implements Runnable{
	
	public EjecutandoTransferencias(Banco miBanco, int cuentaDeOrigen, double cantidadMaxima) {
		this.miBanco = miBanco;
		this.cuentaDeOrigen = cuentaDeOrigen;
		this.cantidadMaxima = cantidadMaxima;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			int cuentaDeDestino = (int)(Math.random()*100);
			double cantidadATransferir = cantidadMaxima * Math.random();
			miBanco.transferencia(cuentaDeOrigen, cuentaDeDestino, cantidadATransferir);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	private Banco miBanco;
	private int cuentaDeOrigen;
	private double cantidadMaxima;
}
