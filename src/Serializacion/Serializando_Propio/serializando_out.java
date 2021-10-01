package Serializacion.Serializando_Propio;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serializando_out {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo Dani = new Vehiculo("Peugeot","208",4,40,2021);
		System.out.println(Dani.toString());
		Dani.setdeposito();
		System.out.println(Dani.toString());
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		Camion Dani2 = new Camion ("Pegaso", "3000", 16,300,1980);
		Dani2.setdeposito();
		System.out.println(Dani2.toString());
		
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("----------------SERIALIZAMOS--------");
		System.out.println("-------------------------------------");
        try {
			ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("/Users/danielgil/Desktop/Serialización/Camion.dat"));
			flujoSalida.writeObject(Dani);
			flujoSalida.close();
			System.out.println("La creación del objeto a sucedido con éxito!!!!");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No se puedo realizar el flujo ");
		}
	}

}
class Vehiculo implements Serializable{
	public Vehiculo(String marca, String modelo,int ruedas,int gasolina,int agno) {
		m = marca;
		mo = modelo;
		r = ruedas;
		gasoil = gasolina;
		ag = agno;
	}
	
	public String getMarca() {
		return m;
		
	}
	public String getModelo() {
		return mo;
		
	}
	public int getRuedas() {
		return r;
		
	}
	public int getGasolina() {
		return gasoil;
		
	}
	public void setdeposito() {
		int vuelta = 5;
		gasoil -= vuelta;
		System.out.println("El deposito actualmente tiene " + gasoil + " litros");
	}
	public int getAgno() {
		return ag;
		
	}
	public String toString() {
		return "El vehiculo es de la marca: " + getMarca() + " modelo: " + getModelo() + ". Número de ruedas: " + getRuedas() + ", con :" + getGasolina() + " litros" + ". Del año " + getAgno();
		
	}
	
	String m,mo;
	int r,gasoil,ag;
}


class Camion extends Vehiculo{

	public Camion(String marca, String modelo, int ruedas, int gasolina, int agno) {
		super(marca, modelo, ruedas, gasolina, agno);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return super.toString();
		
	}
	
	
	
}
