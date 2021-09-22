package Finally;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejemplo_finally {
    Scanner entrada = new Scanner(
            System.in);System.out.println("Elige la opcion: /n1º Cuadrado/n2º  Rectángulo/n3º Triángulo/n4º Círculo");try
    {
        figura = entrada.nextInt();
    }catch(
    Exception e)
    {
        System.out.println("Tienen que ser números");
    }finally
    {
        entrada.close();
    }

    // int entrada =Integer.parseInt(JOptionPane.showInputDialog("Elige la opcion: "
    // + "1º Cuadrado " + "2º Rectángulo " + "3º Triángulo " + "4º Círculo: "));

    switch(figura)
    {
    case 1:
        int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la medida del lado: "));
        System.out.println("El área del cuadrado es: "  + Math.pow(lado, 2));
        break;
    case 2:
        int base = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la medida de la base: "));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la medida de la altura: "));
        System.out.println("El área del Rectángulo es: "  + (base*altura));
        break;
        
    case 3:
        int base_t = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la medida de la base: "));
        int altura_t = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la medida de la altura: "));
        System.out.println("El área del Triángulo es: "  + (base_t*altura_t)/2);
        break;
        
    case 4:
        int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la medida del radio: "));
        int cantidad = radio * radio;
        System.out.println("El área del Círculo es: "  +  (Math.PI) * cantidad);
        break;
        
    }
    // -----------------------------------------------------------------------------------------------------------
    try
    {
        altura = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura en cm : "));
    }catch(
    Exception e)
    {
        System.out.println("Debes introduccir números");
    }finally
    {
        System.out.println("La medidas son:");
    }System.out.println("Si eres hombre tu peso ideal es : "+(altura-110)+" Kg ");System.out.println("Si eres mujer tu peso ideal es: "+(altura-120)+" Kg ");}
    static int figura;
    static int altura;

}
