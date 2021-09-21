package Primera_aplicacion_fx.Archivos_JAR.Archivo_JAR.Excepcion_I.Excepciones_Propias;

import java.util.Scanner;

/*
Vamos a intentarlo hacerlo con entrada por consola, porque con JOptionPane, da error. En Eclipse Si está así, de hecho 
se guarda en disco duro con esa fórmula
 */
public class No_comprobadas {
    public static void main(String[] args){
    System.out.println("Introduzca el email");
    Scanner entrada = new Scanner(System.in);
    String mail = entrada.next();
    examinaMail(mail);
    }

    static void examinaMail(String email) throws LongitudEmailErronea{
        int arroba = 0;
        boolean punto = false;
        String sin = "@";
		char arroba_sin = sin.charAt(0);
		
		String sin_punto = ".";
		char punto_sin = sin_punto.charAt(0);

        if(email.length() <=3){
            LongitudEmailErronea miExcepcion = new LongitudEmailErronea("Cuidado!!!. Tiene meno o igual a tres caracteres");
			throw miExcepcion;
        }

        for(int i = 0; i< email.length(); i++) {
			if(email.charAt(i) ==arroba_sin) {
				arroba ++;
			}
			if(email.charAt(i) == punto_sin) {
				punto=true;
			}
		}
        if(arroba == 1 && punto == true) {
			
			System.out.println(" Es correcto");
		}else {
			System.out.println("Incorrecto");
			
		}
    }
}
class LongitudEmailErronea extends RuntimeException{
    public LongitudEmailErronea() {

    }
	public LongitudEmailErronea(String MensajeError) {
		super(MensajeError);
	}
}