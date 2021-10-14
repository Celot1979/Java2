package ArrayList.Interfaz;

public class Uso {
    public static void main(String[] args){

    }
    
}
class Aritmetica implements Operaciones{
    

    @Override
    public void suma(int a, int b) {
        // TODO
        System.out.println("La suma es : " + (a+b));
    }

    @Override
    public void resta(int a, int b) {
        // TODO
        System.out.println("La resta es : " + (a-b));
    }

    @Override
    public void dividir(int a, int b) {
        // TODO
        System.out.println("El cociente  es : " + (b/a));
    }

    @Override
    public void multiplicar(int a, int b) {
        // TODO
        System.out.println("La multiplo es : " + (b*a));
    }
}