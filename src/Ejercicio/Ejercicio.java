import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ejercicio {
    public static void main(String[] args){
        Cod q = new Cod();
    }
}
class Cod{
	public Cod() {
		 pregunta_1 = JOptionPane.showInputDialog(" Nombre del Directorio ");
		 try {
			 File directorio = new File (File.separator + "Users" + File.separator + "danielgil" +  File.separator +"Desktop" +  File.separator + "Material acceso" +  File.separator + pregunta_1 );
			 dire_Carpeta = directorio.getAbsolutePath();
			 directorio.mkdir();
			 //JOptionPane.showMessageDialog(null, "Se ha creado correctamente el Directorio");
		 }catch(Exception e) {
			 JOptionPane.showMessageDialog(null, "No se ha creado correctamente el Directorio");
		 }
		 pregunta_2 = JOptionPane.showInputDialog("Nombre del Directorio");
		 try {
			 archivo  = new File (File.separator + "Users" + File.separator + "danielgil" +  File.separator +"Desktop" +  File.separator + "Material acceso" +  File.separator + pregunta_1 +  File.separator + pregunta_2 + ".txt" );
			 archivo.createNewFile();
			 System.out.println(archivo.getAbsolutePath());
			 //JOptionPane.showMessageDialog(null, "Se ha creado con éxito el Directorio");
		 }catch(Exception e) {
			 JOptionPane.showMessageDialog(null, "No se ha creado con éxito el Directorio");
		 }
		 
		dire = archivo.getAbsolutePath();
		//JOptionPane.showMessageDialog(null, dire);
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------
	    //----------------------------------------------------------------------------------------------------------------------------------------------------------------
	    //-------------------------------------------------------ESCRIBIR TEXTO / VENTANA EMERGENTE--------------------------------------------------------------------------
	    //----------------------------------------------------------------------------------------------------------------------------------------------------------------
	    //----------------------------------------------------------------------------------------------------------------------------------------------------------------
	    escribir(dire);
	    //----------------------------------------------------------------------------------------------------------------------------------------------------------------
	    //----------------------------------------------------------------------------------------------------------------------------------------------------------------
	    //------------------------------------------------------- BORRADO DE ARCHIVO O DIRECTORIO--------------------------------------------------------------------------
	    //----------------------------------------------------------------------------------------------------------------------------------------------------------------
	    //----------------------------------------------------------------------------------------------------------------------------------------------------------------
	    pregunta_4 = Integer.parseInt(JOptionPane.showInputDialog("Desea borrar\n1.Archivo\n2.Directorio\n3.Salir"));
	    switch(pregunta_4) {
	    case 1:
	    	 borrado_archivo(dire);
	    	break;
	    case 2:
	    	borrado_Directorio(dire,dire_Carpeta);
	    	break;
	    	
	    case 3:
	    	System.out.println("Ok");
	    	break;
	    }
		
		
}
	//------------------------------------------------------- FUNC// ESCRIBIR TEXTO / VENTANA EMERGENTE--------------------------------------------------------------------------
	public void escribir(String dire) {
		List = new ArrayList<String>();
		pregunta_3 = JOptionPane.showInputDialog("Texto que deseas guardar");
		//JOptionPane.showMessageDialog(null,pregunta_3 );
		Listado.add(pregunta_3);
		try {
			FileWriter fw = new FileWriter(dire);
			PrintWriter escritura = new PrintWriter(fw);
			//si cambias el la clase del objeto escritura por un objeto de tipo Printwriter este internamente hará el casting de los números
			//a caracteres de forma automática.


			for(int i=0;i<Listado.size();i++){
		         escritura.println(Listado.get(i));
		    }
		    escritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Listado);
		
		
		
	}
	//-------------------------------------------------------FUNC // BORRADO DE ARCHIVO O DIRECTORIO--------------------------------------------------------------------------
	public void borrado_archivo(String dire) {
		//System.out.println("Mirando para borrar el archivo");
		File fichero = new File(dire);
		try {
			if(fichero.delete()) {
				JOptionPane.showMessageDialog(null, "El archivo ha sido borrado con éxito");
			}else {
				JOptionPane.showMessageDialog(null, "El fichero no puede ser borrado");
				
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Hubo un error...!!!!");
			
		}
	}
	
	public void borrado_Directorio(String dire,String dire_Carpeta) {
		/*1º Se debe de borrar el archivo que contenga los directorios.
		 * 2º Una vez borrado el archivo- confirmado por ventana emergente-, introduccimos código de borrado
		 * del directorio.
		 */
		File fichero = new File(dire);
		try {
			if(fichero.delete()) {
				JOptionPane.showMessageDialog(null, "El archivo ha sido borrado con éxito");
				File dir = new File(dire_Carpeta);
				   if (dir.isDirectory())
				   {
				         dir.delete();
				   }
			}else {
				JOptionPane.showMessageDialog(null, "El fichero no puede ser borrado");
				
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Hubo un error...!!!!");
			
		}
	}
	
	
	String pregunta_1,pregunta_2,pregunta_3;
	String dire, dire_Carpeta;
	public  ArrayList<String> Listado;
	File archivo;
	int  pregunta_4;
	
}