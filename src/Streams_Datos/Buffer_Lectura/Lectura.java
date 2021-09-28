package Streams_Datos.Buffer_Lectura;

import java.io.BufferedReader;
import java.io.FileReader;

public class Lectura {
    Buffer_lec q = new Buffer_lec();
    q.lectura();
}
class Buffer_lec{
    public void lectura(){
        try{
            BufferedReader l = new BufferedReader(new FileReader("/Users/danielgil/Desktop/Practica.txt"));
            String linea = "";
            while(linea != null){
                linea = l.readLine();
                if(linea != null) System.out.println(linea);
            }

            l.close();

        }catch(Exception e){
            System.out.println("No se pudo leer")
        }
        
    }
}