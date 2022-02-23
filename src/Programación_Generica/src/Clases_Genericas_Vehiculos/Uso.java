package Clases_Genericas_Vehiculos;

public class Uso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generica <String> veh1 = new Generica <String>();
		veh1.setDatos("Seat", "Santana", 50);
		veh1.setGasolina(30);
		veh1.setViajes();
		System.out.println(veh1.getIfo());
	}

}
