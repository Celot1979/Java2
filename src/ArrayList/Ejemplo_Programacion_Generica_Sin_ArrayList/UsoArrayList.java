package ArrayList.Ejemplo_Programacion_Generica_Sin_ArrayList;
import java.io.File;
public class UsoArrayList {
    // TODO Auto-generated method stub
		MiArrayList archivos = new MiArrayList(5);
		archivos.agregaElemento("Maria");
		archivos.agregaElemento("Daniel");
		archivos.agregaElemento("Sandra");
		archivos.agregaElemento("Manuel");
		archivos.agregaElemento("Elisa");
		String nombrePersona = (String) archivos.getObjeto(2);
		
		/*archivos.agregaElemento(new File("texto1.txt"));
		archivos.agregaElemento(new File("texto2.txt"));
		archivos.agregaElemento(new File("texto3.txt"));
		archivos.agregaElemento(new File("texto4.txt"));
		archivos.agregaElemento(new File("texto5.txt"));
		File nombreArchivos = (File) archivos.getObjeto(2);*/
		System.out.println(nombrePersona);
}
