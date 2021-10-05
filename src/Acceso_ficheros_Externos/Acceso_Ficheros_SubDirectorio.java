package Acceso_ficheros_Externos;

import java.io.File;

public class Acceso_Ficheros_SubDirectorio {
    public static void main(String[] args){
        File subdirectorio = new File(File.separator + "Users" + File.separator + "danielgil" +  File.separator +"Desktop" +  File.separator + "Material acceso");
        String[] archivos =subdirectorio.list();
        for(int i=0; i<archivos.length; i++){
            System.out.println(archivos[i]);
            File archivosSubdirectorio = new File(subdirectorio.getAbsolutePath(), archivos[i]);
            if(archivosSubdirectorio.isDirectory()){
                String [] otros = archivosSubdirectorio.list();
                for(int j=0; j<otros.length; j++){
                    System.out.println(otros[j]);

                }
            }

        }
    }
}
