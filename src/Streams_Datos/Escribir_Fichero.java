package Streams_Datos;

import java.io.FileWriter;
import java.io.IOException;

public class Escribir_Fichero {

}

class Escribir {
    public void escribiendo() {
        String texto = " Esto es para pder tener una copia del archivo en Git Hub";
        try {
            FileWriter escritura = new FileWriter("/Users/danielgil/Desktop/stream_nuevo_Git.txt");
            for (int i = 0; i < texto.length(); i++) {
                escritura.write(texto.charAt(i));
            }
            escritura.close();
            System.out.println("Archivo de texto creado con éxito!!!")
        } catch (IOException e) {
            System.out.println("No se ha podido realizar la acción requeriada");
        }
    }
}