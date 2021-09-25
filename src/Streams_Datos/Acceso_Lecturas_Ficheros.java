package Streams_Datos;

import java.io.FileReader;

public class Acceso_Lecturas_Ficheros {

    Lectura lex = new  Lectura();
    lex.leerDatos();

}

class Lectura {

    public void leerDatos() {
        try {
            FileReader entrada = new FileReader("/Users/danielgil/Desktop/Practica.txt");
            int caracteres = entrada.read();
            char letra = (char) caracteres;
            while (caracteres != -1) {
                System.out.println(letra);
                caracteres = entrada.read();
                letra = (char) caracteres;

            }
            entrada.close();
        } catch (Exception e) {
            System.out.println("No hemos encontrado el archivo");
        }

    }
}