package Acceso_ficheros_Externos;

import java.io.File;

public class Acceso_fichero {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        File directorio = new File("/Users/danielgil/Desktop/Material acceso");
        System.out.println(directorio.getAbsolutePath());
        System.out.println(directorio.exists());
        String [] archivo =directorio.list();
        for(int i = 0; i < archivo.length; i++){
            System.out.println(archivo[i]);
        }

    }
}
