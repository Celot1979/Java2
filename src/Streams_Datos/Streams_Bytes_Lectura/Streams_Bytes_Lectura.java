package Streams_Datos.Streams_Bytes_Lectura;

import java.io.*;

public class Streams_Bytes_Lectura {
    try{
        FileInputStream lectura = new FileInputStream("/Users/danielgil/Desktop/Prueba_LEctura/Odin_prueba.jpg");
        boolean final_archivo = false;
		while(!final_archivo) {
            int byteImagenEntrada = lectura.read();
			if(byteImagenEntrada == -1) final_archivo= true;
			System.out.println(byteImagenEntrada);
    }catch(FileNotFoundException e){
        System.out.println("Hola");
    }
    
