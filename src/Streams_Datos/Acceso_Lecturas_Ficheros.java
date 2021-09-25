package Streams_Datos;

import java.io.FileReader;

public class Acceso_Lecturas_Ficheros {

    lectura lex = new lectura();
    lex.leer();

}

class lectura(){

    public void leer(){
        try{
            FileReader entrada = new FileReader("/Users/danielgil/Desktop/Practica.txt");
            int caracteres = entrada.read();
            char letra = (char) caracteres;
            while(caracteres != -1){
                System.out.println(letra);
                caracteres = entrada.read();
                letra = (char) caracteres;

            }
        }catch(Exception e){
            System.out.println("No hemos encontrado el archivo");
        }
        
    }
}